function byId(id){
	return typeof(id) === "string"?document.getElementById(id):id
}

var index = 0,
	timer = null,
	banner = byId("banner").getElementsByTagName("img"),
	sections = byId("section").getElementsByTagName("div"),
	len = banner.length;

function slideImg() {
	var main = byId("main");
	main.onmouseover = function(){
		if(timer) clearInterval(timer);
	}
	main.onmouseout = function(){
		timer = setInterval(function(){
			index++;
			if(index >= len){
				index = 0;
			}
			changeImg();
			changeSec();
		}, 1000);
	}

	main.onmouseout();
	for(var d=0;d<len;d++){
		sections[d].id = d
		sections[d].onmouseover = function(){
			index = this.id;
			changeImg();
			changeSec();
		}
	}
}

function changeImg(){
	for(var i=0;i<len;i++){
		banner[i].style.display = 'none';
	}
	banner[index].style.display = 'block';
}

function changeSec(){
	for(var i=0;i<len;i++){
		sections[i].style.background = 'white';
	}
	sections[index].style.background = '#FFCC00';
}
slideImg();