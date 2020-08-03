window.addEventListener("load",function(){

var inputMessage=document.getElementById('input_message');
var inputCount=document.getElementById('input_count');
var textColor=document.getElementById('text_color');
var bgColor=document.getElementById('bg_color');
var buttonPrint=document.getElementById('button_print');
var outputContxt=document.getElementById('contxt');

buttonPrint.addEventListener("click",function(){
   createElements(inputCount.value, inputMessage.value, textColor.value, bgColor.value, outputContxt);


    });

});

function createElements(count, message, tColor, bgColor, outputContxt){
        var i;
        for(i=0;i<count;i++){
          var pTag=document.createElement("p");
          var text=document.createTextNode(message);
          pTag.appendChild(text);
          outputContxt.appendChild(pTag);
}
}

function fun1(){
var textC=document.getElementById("text_color").value;
document.getElementById('contxt').style.color=textC;
var bgcolor=document.getElementById("bg_color").value;
document.getElementById('contxt').style.backgroundColor=bgcolor;


}








