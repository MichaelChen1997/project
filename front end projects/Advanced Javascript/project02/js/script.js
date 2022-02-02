var username = document.querySelector("#username"),//获取用户名
    password = document.querySelector("#password"),//获取密码
    con_pass = document.querySelector("#confirm-password"),//获取确认密码
    uname = document.querySelector("#Name"),//获取姓名
    number = document.querySelector("#number"),//获取身份证号码
    email = document.querySelector("#email"),//获取邮箱号码
    telephone = document.querySelector("#telephone"),//获取手机号码
    hints= document.querySelectorAll(".hint"),//获取所有提示文段的下标
    red = document.querySelector("#red"),
    yellow = document.querySelector("#yellow"),
    green = document.querySelector("#green"),
    btn = document.querySelector("#btn").querySelector('a'),
    imooc = document.querySelector(".imooc"),
    form = document.querySelector("#form"),
    checkcbox = document.querySelector("#checkbox")
    //aCho = document.querySelector("#choose"), oBtn = document.querySelector("#handup");
var test1 = false, test2 = false, test3 = false, test4 = false, test5 = false, test6 = false, test7 = false
    ;

username.onblur = function () {
    var reg = /^[a-z]\w{5,29}/;
    if (this.value == "") {
        hints[0].innerHTML = "6-30位字母、数字“-”，字母开头";
        hints[0].style.color = "red";
    } else {
        if (!reg.exec(username.value)) {
            hints[0].innerHTML = "6-30位字母、数字“-”，字母开头";
            hints[0].style.color = "red";
        } else {
            hints[0].innerHTML = "用户名输入正确";
            hints[0].style.color = "green";
            test1 = true;
        }
    }
};
password.onblur = function () {
    var weak_reg = /\S{6,20}/,
    	normal_reg = /[a-zA-Z][0-9]*/,
    	strong_reg = /\W[a-zA-Z]*/;
    if (this.value == "") {
        hints[1].innerHTML = "6-20位字母、数字或符号";
        hints[1].style.color = "red";
        red.style.background = "red";
 		yellowstyle.background = "#7baed9";
 		green.style.background = "#7baed9";
    } else {
    	if (weak_reg.exec(password.value) && normal_reg.exec(password.value) && strong_reg.exec(password.value)) {
            hints[1].innerHTML = ""
            hints[1].style.color = "green";
            red.style.background = "red";
            yellow.style.background = "yellow";
            green.style.background = "green";
            test2 = true;
        } else if(weak_reg.exec(password.value) && normal_reg.exec(password.value)){
            hints[1].innerHTML = ""
            hints[1].style.color = "green";
               red.style.background = "red";
             yellow.style.background = "yellow";
             green.style.background = "#7baed9";
             test2 = true;
        } else if(weak_reg.exec(password.value)){
            hints[1].innerHTML = ""
            hints[1].style.color = "green";
               red.style.background = "red";
             yellow.style.background = "#7baed9";
             green.style.background = "#7baed9";
             test2 = true;
        } else{
            hints[1].innerHTML = "6-20位字母、数字或符号";
            hints[1].style.color = "red";
            red.style.background = "red";
            yellow.style.background = "#7baed9";
            green.style.background = "#7baed9";
        }
    }
};

con_pass.onblur = function () {
    if (this.value == "") {
        hints[2].innerHTML = "输入框不能为空";
        hints[2].style.color = "red";
    } else {
        if (this.value != password.value) {
            hints[2].innerHTML = "两次密码输入不一致，请重新输入";
            hints[2].style.color = "red";
        } else {
            hints[2].innerHTML = "两次输入一致";
            hints[2].style.color = "green";
            test3 = true;
        }
    }
};

uname.onblur = function () {
	var reg = /[a-zA-Z]{3,30}|[\u4e00-\u9fa5]{2,15}/;
    if (this.value == "") {
        hints[3].innerHTML = "输入框不能为空";
        hints[3].style.color = "red";
    } else {
        if (!reg.exec(uname.value)) {
            hints[3].innerHTML = "姓名只能包含中文或者英文,且字符在3-30个之间！";
            hints[3].style.color = "red";
        } else {
            hints[3].innerHTML = "姓名输入正确";
            hints[3].style.color = "green";
            test4 = true;
        }
    }
};

number.onblur = function () {
	var reg = /^\d{18}$|(^\d{17}(\d|X|x)$)/;
    if (this.value == "") {
        hints[4].innerHTML = "输入框不能为空";
        hints[4].style.color = "red";
    } else {
        if (!reg.exec(number.value)) {
            hints[4].innerHTML = "请输入18位身份证号码";
            hints[4].style.color = "red";
        } else {
            hints[4].innerHTML = "号码输入正确";
            hints[4].style.color = "green";
            test5 = true;
        }
    }
};

email.onblur = function () {
	var reg = /^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/;
    if (this.value == "") {
        hints[5].innerHTML = "输入框不能为空";
        hints[5].style.color = "red";
    } else {
        if (!reg.exec(email.value)) {
            hints[5].innerHTML = "请输入正确的邮箱";
            hints[5].style.color = "red";
        } else {
            hints[5].innerHTML = "邮箱格式正确";
            hints[5].style.color = "green";
            test6 = true;
        }
    }
};

telephone.onblur = function () {
	var reg = /^[1][3,4,5,6,7,8,9][0-9]{9}$/;
    if (this.value == "") {
        hints[6].innerHTML = "输入框不能为空";
        hints[6].style.color = "red";
    } else {
        if (!reg.exec(telephone.value)) {
            hints[6].innerHTML = "您输入的手机号码不是有效的格式！";
            hints[6].style.color = "red";
        } else {
            hints[6].innerHTML = "手机格式正确";
            hints[6].style.color = "green";
            test7 = true;
        }
    }
};

btn.onclick = function () {
    if (checkcbox.checked == true && test1 == true&& test2 == true && test3 == true && test4 == true&& test5 == true
        && test6 == true && test7 == true) {
        btn.href="www.imooc.com";
    }
};