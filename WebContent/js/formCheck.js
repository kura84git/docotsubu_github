/**
 *
 */

function check() {
	var flagN1 = 0;
	var flagP1 = 0;

	if(document.form01.name.value =="") {
		flagN1 = 1;
	}
	if(document.form01.pass.value == "") {
		flagP1 = 1;
	}

	if(flagN1 && flagP1) {
		window.alert("名前とパスワードの入力項目に未入力があります");
		return false;
	} else if(flagN1) {
		window.alert("名前の入力項目に未入力があります");
		return false;
	} else if(flagP1) {
		window.alert("パスワードの入力項目に未入力があります");
		return false;
	} else {
		return true;
	}


}