var iframe=document.getElementsByTagName('iframe')[0],
close=document.getElementById('close'),
curtain=document.getElementById('curtain'),
logo=document.getElementsByTagName('img')[0],
header=document.getElementById('header'),
nav=document.getElementById('nav'),
btn=document.getElementById('menuBtn');
close.onclick = function(){
    iframe.style.display='none';
    close.style.display='none';
    curtain.style.display='none';
}
curtain.onclick = function(){
    iframe.style.display='none';
    close.style.display='none';
    curtain.style.display='none';
}

function openUrl(url){
    iframe.style.display='block';
    close.style.display='block';
    curtain.style.display='block';
    iframe.src='pages/'+url;
}
window.onscroll = function(){
    if (document.body.scrollTop > 1 || document.documentElement.scrollTop > 1) {
        logo.className='smallLogo';
        header.className='lowerHeader';
    }else if (document.body.scrollTop <= 1 || document.documentElement.scrollTop <=1) {
        header.className='higherHeader';
        logo.className ='bigLogo';

    }
}

var flag =true;
btn.onclick = function(){
    if (flag){
        nav.style.display='block';
        flag=false
    } else{
        nav.style.display='none';
        flag=true
    }
    
}
