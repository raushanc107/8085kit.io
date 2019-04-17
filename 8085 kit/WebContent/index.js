var led=new Array();
var f=3;
  		  			function _(e) {
  						return document.getElementById(e);
  					}

						
  		  			function trainer() {
  		  				led[0]=_('c4');
  						led[1]=_('c3');
  						led[2]=_('c2');
  						led[3]=_('c1');
  						led[4]=_('d2');
  						led[5]=_('d1');
  					}
  					function settheme(){
  						var x=_('switch1');
  						if(x.checked){
  							//_('opptablesearch').style.backgroundColor='#1e1e1e';
  							_('display').style.background='rgba(255,0,0,0.5)';
  							_('detail').style.backgroundColor='#1e1e1e';
  						}
  						else{
  							//_('opptablesearch').style.backgroundColor='#f2f2f2';
  							_('display').style.background='rgba(0,0,0,0.9)';
  							_('detail').style.backgroundColor='#f2f2f2';

  						}
  						}

  					
  		  			
  		  			window.onload=function(){
  		  				trainer();
  		  				document.getElementById('btn6').click();

  		  				settheme();
  		  	  			display('-------------------friend');
  		  			}
  		  			
  		  			
  		  			
  		  			function display(s){
  		  				var i=0;
  		  				for(i=0;i<s.length && i<6 ;i++){
  		  					led[i].innerHTML=s[i+19];
  		  				}
  		  				while(i<led.length){
  		  					led[i].innerHTML=" ";
  		  					i++;
  		  				}
  		  				
  		  				set();
  		  			}


function setcolor(e){
	var x=document.getElementsByClassName('btnn');
	var i=0;
	for(i=0;i<x.length;i++){
		if(x[i]==e){
			x[i].style.backgroundColor='green';
			x[i].style.color='white';
			f=i;
		}
		else{
			x[i].style.backgroundColor='transparent';
			x[i].style.color='green';
		}
	}	
}

function set(){
	if(f==0){
	document.getElementById('btn1').click();}
 if(f==1){
	document.getElementById('btn2').click();}
	

}


function astable(e) {
	setcolor(e);
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
   	document.getElementById("astable").innerHTML = this.responseText;
    
    
    }
  };
  xhttp.open("GET", "astable.jsp", true);
  xhttp.send();
}



function memtable(e) {
setcolor(e);
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
   	document.getElementById("astable").innerHTML = this.responseText;
    
    
    }
  };
  xhttp.open("GET", "memtable2.jsp", true);
  xhttp.send();
}





function mem1() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
   	document.getElementById("tcont").innerHTML = this.responseText;
    _('btn3').style.backgroundColor="transparent";
    _('btn3').style.color='green';
    _('btn4').style.backgroundColor="green";
    _('btn4').style.color='white';
    
    }
  };
  xhttp.open("GET", "memtable.jsp", true);
  xhttp.send();
}









function converter(e) {
setcolor(e);
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
   	document.getElementById("astable").innerHTML = this.responseText;
    
    
    }
  };
  xhttp.open("GET", "converter.jsp", true);
  xhttp.send();
}


function oppcode(e) {
setcolor(e);
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
   	document.getElementById("astable").innerHTML = this.responseText;
    
    
    }
  };
  xhttp.open("GET", "mnemonic.jsp", true);
  xhttp.send();
}









var myVar = setInterval(myTimer, 1000);

function myTimer() {
  var d = new Date();
  document.getElementById("time").innerHTML = d.toLocaleTimeString();
}






function convert1(){
	var v=_('hex').value;
	var d=ConvertBase.hex2dec(v);
	var b=ConvertBase.hex2bin(v);
	_('dec').value=d;
	_('bin').value=b;

}
function convert2(){
	var v=_('dec').value;
	var h=ConvertBase.dec2hex(v);
	var b=ConvertBase.dec2bin(v);
	_('hex').value=h;
	_('bin').value=b;

}

function convert3(){
	var v=_('bin').value;
	var h=ConvertBase.bin2hex(v);
	var d=ConvertBase.bin2dec(v);
	_('hex').value=h;
	_('dec').value=d;
}



(function(){

    var ConvertBase = function (num) {
        return {
            from : function (baseFrom) {
                return {
                    to : function (baseTo) {
                        return parseInt(num, baseFrom).toString(baseTo);
                    }
                };
            }
        };
    };
        
    // binary to decimal
    ConvertBase.bin2dec = function (num) {
        return ConvertBase(num).from(2).to(10);
    };
    
    // binary to hexadecimal
    ConvertBase.bin2hex = function (num) {
        return ConvertBase(num).from(2).to(16);
    };
    
    // decimal to binary
    ConvertBase.dec2bin = function (num) {
        return ConvertBase(num).from(10).to(2);
    };
    
    // decimal to hexadecimal
    ConvertBase.dec2hex = function (num) {
        return ConvertBase(num).from(10).to(16);
    };
    
    // hexadecimal to binary
    ConvertBase.hex2bin = function (num) {
        return ConvertBase(num).from(16).to(2);
    };
    
    // hexadecimal to decimal
    ConvertBase.hex2dec = function (num) {
        return ConvertBase(num).from(16).to(10);
    };
    
    this.ConvertBase = ConvertBase;
    
})(this);





