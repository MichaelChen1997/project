window.onload = function loaded(){

    var index=0,
    navItem=document.getElementsByClassName('nav-item'),
    sections=document.getElementsByTagName('section'),
    len=navItem.length,
    services = document.getElementById('services'),
    menuBtn = document.getElementById('menuBtn'),
    nav=document.getElementById('nav'),
    flag=false,
    f=false;
 
    for (var i=0;i<len;i++){
        sections[i].style.display="none";
    }
    sections[index].style.display="block";
    menuBtn.onclick = function(){
        if (f==true){
            nav.style.display='none';
            f=false;
        } else{
            nav.style.display='block';
            f=true;
        }
    }
    for(var i=0;i<len;i++){
        navItem[i].id = i;
        navItem[i].onclick = function(){
            index = this.id;
            if (index == 5){

            } else if (index!=3){
                for(var i=0;i<len;i++){
                    sections[i].style.display = "none";
                }
                sections[index].style.display = "block";    
            }else{
                if (flag==true){
                    services.style.display='none';
                    flag=false;
                } else{
                    services.style.display = "block";
                    flag=true;
                }
                
            }
        }
     }
}

