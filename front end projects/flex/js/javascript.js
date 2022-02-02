var btn = document.getElementsByClassName('btn')[0];
var ul = document.getElementsByClassName('content')[0];
var bool = false;
/*点击btn下拉菜单*/
btn.onclick = function() {
	if (!bool) {
		ul.style.top = "80px";
		bool = true;
	} else {
		ul.style.top = "-180px";
		bool = false;
	}
}