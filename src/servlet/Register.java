package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.RegisterUser;
import model.RegisterUserLogic;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String action = request.getParameter("action");

		if(action == null) {

			String path = "/register.jsp";
			RequestDispatcher dis = request.getRequestDispatcher(path);
			dis.forward(request, response);

		} else if(action.equals("done")) {

			HttpSession session = request.getSession();
			RegisterUser registerUser = (RegisterUser)session.getAttribute("registerUser");

			RegisterUserLogic rul = new RegisterUserLogic();
			rul.execute(registerUser);

			String path = "/registerDone.jsp";
			RequestDispatcher dis = request.getRequestDispatcher(path);
			dis.forward(request, response);
		}

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String userId = request.getParameter("userId");
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		String mail = request.getParameter("mail");
		int age = Integer.parseInt(request.getParameter("age"));

		RegisterUser registerUser = new RegisterUser(userId,name,pass,mail,age);

		HttpSession session = request.getSession();
		session.setAttribute("registerUser", registerUser);

		String path = "/registerConfirm.jsp";
		RequestDispatcher dis = request.getRequestDispatcher(path);
		dis.forward(request, response);
	}

}
