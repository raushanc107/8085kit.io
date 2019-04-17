package files;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jdt.core.compiler.CharOperation;


public class trainer{
    public Assembler o=null;
     char c4='0',c3='0',c2='0',c1='0',d2='0',d1='0';
    boolean reg=false,mem=false,set=false,go=false;
    String s44,s43,s42,s41,s22,s21;
    
    
    public trainer(Assembler o)
     {
         this.o=o;
         
     }
    
    public String reset() {                                            
        mem=false;reg=false;set=false;go=false;
        o.stop=true;
        c1='0';c2='0';c3='0';c4='0';d1='0';d2='0';
        s44="-";
        s43="-";
        s42="-";
        s41="-";
        s22="-";
        s21="-";
        dis(o);
        return s44+s43+s42+s41+s22+s21;
    } 
    
    
    public String next() {                                           
        int memNo=o.engine.Hex2Dec(""+c4+c3+c2+c1);
        if(memNo>=o.matrix.stopAddress){memNo=o.matrix.beginAddress-1;
                String s=o.engine.Dec2Hex(memNo+1);
                c4=s.charAt(0);c3=s.charAt(1);c2=s.charAt(2);c1=s.charAt(3);}
        if(set){String s=o.engine.Dec2Hex(memNo+1);
                c4=s.charAt(0);c3=s.charAt(1);c2=s.charAt(2);c1=s.charAt(3);
                }
        reg=false;set=true;
        s41=String.valueOf(c1);
        s42=String.valueOf(c2);
        s43=String.valueOf(c3);
        s44=String.valueOf(c4);
        int n=o.matrix.memory[o.engine.Hex2Dec(""+c4+c3+c2+c1)];
        d1=o.engine.Dec2Hex2digit(n).charAt(1);
        d2=o.engine.Dec2Hex2digit(n).charAt(0);
        s22=String.valueOf(d2);
        s21=String.valueOf(d1);
        dis(o);
        return s44+s43+s42+s41+s22+s21;

    }  
    
    
     public String buttonPrevActionPerformed() {                                           
        int memNo=o.engine.Hex2Dec(""+c4+c3+c2+c1);
        if(memNo<=o.matrix.beginAddress){memNo=o.matrix.stopAddress+1;
                String s=o.engine.Dec2Hex(memNo+1);
                c4=s.charAt(0);c3=s.charAt(1);c2=s.charAt(2);c1=s.charAt(3);
        }
        if(set){String s=o.engine.Dec2Hex(memNo-1);
                c4=s.charAt(0);c3=s.charAt(1);c2=s.charAt(2);c1=s.charAt(3);
                }
        reg=false;set=true;
        s41=String.valueOf(c1);
        s42=String.valueOf(c2);
        s43=String.valueOf(c3);
        s44=String.valueOf(c4);
        int n=o.matrix.memory[o.engine.Hex2Dec(""+c4+c3+c2+c1)];
        d1=o.engine.Dec2Hex2digit(n).charAt(1);
        d2=o.engine.Dec2Hex2digit(n).charAt(0);
        s22=String.valueOf(d2);
        s21=String.valueOf(d1);
        
        dis(o);
        
        
        return s44+s43+s42+s41+s22+s21;

    } 
     
     
      public String buttonGoActionPerformed() {                                         
        go=true;
        String s=o.engine.HexAutoCorrect4digit(o.jTextFieldBeginFrom);
        s44=String.valueOf(s.charAt(0));
        s43=String.valueOf(s.charAt(1));
        s42=String.valueOf(s.charAt(2));
        s41=String.valueOf(s.charAt(3));
        s=o.engine.Dec2Hex2digit(o.matrix.memory[o.engine.Hex2Dec(s)]);
        s22=String.valueOf(s.charAt(0));
        s21=String.valueOf(s.charAt(1));
        
        return s44+s43+s42+s41+s22+s21;

    }  
    public String buttonRegActionPerformed() {                                          
        mem=false;reg=true;set=false;go=false;
      s44=String.valueOf('r');
      s43=String.valueOf('e');
       s42=String.valueOf('g');
       s41=String.valueOf('*');
      s22=String.valueOf('*');
       s21=String.valueOf('*');
       
        return s44+s43+s42+s41+s22+s21;
    }  
    
   public String buttonMemActionPerformed() {                                          
        mem=true;reg=false;set=false;go=false;
        
        s44=String.valueOf('*');
        s43=String.valueOf('*');
        s42=String.valueOf('*');
        s41=String.valueOf('*');
        s22=String.valueOf('*');
        s21=String.valueOf('*');
       
          return s44+s43+s42+s41+s22+s21;
    } 
    
    
    
    
    
    
    
    
     public String button6() {                                         
        if(((!set)&&mem)||go){

        s44=String.valueOf(c3);
        s43=String.valueOf(c2);
        s42=String.valueOf(c1);
        s41=String.valueOf('6');
        c4=c3;c3=c2;c2=c1;c1='6';
        if(go){
                o.matrix.PC=o.engine.Hex2Dec(""+c4+c3+c2+c1);
                o.jTextFieldBeginFrom=""+c4+c3+c2+c1;
              }

        }
        else if(reg){
            s41=String.valueOf('L');
            s22=String.valueOf(o.engine.Dec2Hex2digit(o.matrix.L).charAt(0));
            s21=String.valueOf(o.engine.Dec2Hex2digit(o.matrix.L).charAt(1));
        }
        
        else if(set&&mem){  
            s22=String.valueOf(d1);
            s21=String.valueOf('6');
             d2=d1;d1='6';
             int memNo=o.engine.Hex2Dec(""+c4+c3+c2+c1);
             o.matrix.memory[memNo]=o.engine.Hex2Dec(""+d2+d1);
             o.set();
             if((memNo-o.matrix.beginAddress)<999&&(memNo-o.matrix.beginAddress)>=0)o.jTableAssembler[memNo-o.matrix.beginAddress][4]=""+d2+d1;

        }
        else{
        s44=String.valueOf('e');
        s43=String.valueOf('r');
        s42=String.valueOf('r');
        s41=String.valueOf('o');
        s22=String.valueOf('r');
        s21=String.valueOf('*');

        }
        
        return s44+s43+s42+s41+s22+s21;
    }  
    
    public String button8() {                                        
        if(((!set)&&mem)||go){

        s44=String.valueOf(c3);
        s43=String.valueOf(c2);
        s42=String.valueOf(c1);
        s41=String.valueOf('8');
        c4=c3;c3=c2;c2=c1;c1='8';
        if(go){
                o.matrix.PC=o.engine.Hex2Dec(""+c4+c3+c2+c1);
                o.jTextFieldBeginFrom=""+c4+c3+c2+c1;
              }

        }
        else if(reg){
            String s=o.engine.Dec2Hex(o.matrix.SP);
            s44=String.valueOf(s.charAt(0));
            s43=String.valueOf(s.charAt(1));
            s42=String.valueOf(s.charAt(2));
            s41=String.valueOf(s.charAt(3));
            s22=String.valueOf(o.engine.Dec2Hex2digit(o.matrix.memory[o.matrix.SP]).charAt(0));
            s21=String.valueOf(o.engine.Dec2Hex2digit(o.matrix.memory[o.matrix.SP]).charAt(1));

        }
        else if(set&&mem){
            s22=String.valueOf(d1);
            s21=String.valueOf('8');
             d2=d1;d1='8';
             int memNo=o.engine.Hex2Dec(""+c4+c3+c2+c1);
             o.matrix.memory[memNo]=o.engine.Hex2Dec(""+d2+d1);
             o.set();
             if((memNo-o.matrix.beginAddress)<999&&(memNo-o.matrix.beginAddress)>=0)o.jTableAssembler[memNo-o.matrix.beginAddress][4]=""+d2+d1;

        }
        else{
        s44=String.valueOf('E');
        s43=String.valueOf('r');
        s42=String.valueOf('r');
        s41=String.valueOf('o');
        s22=String.valueOf('r');
        s21=String.valueOf('*');

        }
        dis(o);
        return s44+s43+s42+s41+s22+s21;
    }

     public String button0() {                                         

        if(((!set)&&mem)||go){

        s44=String.valueOf(c3);
        s43=String.valueOf(c2);
        s42=String.valueOf(c1);
        s41=String.valueOf('0');
        c4=c3;c3=c2;c2=c1;c1='0';
        if(go){
                o.matrix.PC=o.engine.Hex2Dec(""+c4+c3+c2+c1);
                o.jTextFieldBeginFrom=""+c4+c3+c2+c1;
              }

        }
        else if(reg){
            s41=String.valueOf('a');
                    s22=String.valueOf(o.engine.Dec2Hex2digit(o.matrix.A).charAt(0));
                    s21=String.valueOf(o.engine.Dec2Hex2digit(o.matrix.A).charAt(1));
            }
        else if(set&&mem){
            s22=String.valueOf(d1);
            s21=String.valueOf('0');
             d2=d1;d1='0';
             int memNo=o.engine.Hex2Dec(""+c4+c3+c2+c1);
             o.matrix.memory[memNo]=o.engine.Hex2Dec(""+d2+d1);
             o.set();
             if((memNo-o.matrix.beginAddress)<999&&(memNo-o.matrix.beginAddress)>=0)o.jTableAssembler[memNo-o.matrix.beginAddress][4]=""+d2+d1;

        }
        else{
        s44=String.valueOf('E');
        s43=String.valueOf('r');
        s42=String.valueOf('r');
        s41=String.valueOf('o');
        s22=String.valueOf('r');
        s21=String.valueOf('*');

        }
       
      return s44+s43+s42+s41+s22+s21;
    }
     
     public String button1() {                                         
        if(((!set)&&mem)||go){

        s44=String.valueOf(c3);
        s43=String.valueOf(c2);
        s42=String.valueOf(c1);
        s41=String.valueOf('1');
        c4=c3;c3=c2;c2=c1;c1='1';
        if(go){
                o.matrix.PC=o.engine.Hex2Dec(""+c4+c3+c2+c1);
                o.jTextFieldBeginFrom=""+c4+c3+c2+c1;
              }

        }
        else if(reg){
            s41=String.valueOf('b');
            s22=String.valueOf(o.engine.Dec2Hex2digit(o.matrix.B).charAt(0));
            s21=String.valueOf(o.engine.Dec2Hex2digit(o.matrix.B).charAt(1));

        }
        else if(set&&mem){
            s22=String.valueOf(d1);
            s21=String.valueOf('1');
             d2=d1;d1='1';
             int memNo=o.engine.Hex2Dec(""+c4+c3+c2+c1);
             o.matrix.memory[memNo]=o.engine.Hex2Dec(""+d2+d1);
             o.set();
             if((memNo-o.matrix.beginAddress)<999&&(memNo-o.matrix.beginAddress)>=0)o.jTableAssembler[memNo-o.matrix.beginAddress][4]=""+d2+d1;
        }
        else{
        s44=String.valueOf('E');
        s43=String.valueOf('r');
        s42=String.valueOf('r');
        s41=String.valueOf('o');
        s22=String.valueOf('r');
        s21=String.valueOf('*');

        }
       
        return s44+s43+s42+s41+s22+s21;
    } 
     
     public String button2() {                                         
        if(((!set)&&mem)||go){

        s44=String.valueOf(c3);
        s43=String.valueOf(c2);
        s42=String.valueOf(c1);
        s41=String.valueOf('2');
        c4=c3;c3=c2;c2=c1;c1='2';
        if(go){
                o.matrix.PC=o.engine.Hex2Dec(""+c4+c3+c2+c1);
                o.jTextFieldBeginFrom=""+c4+c3+c2+c1;
              }

        }
        else if(reg){
            s41=String.valueOf('C');
            s22=String.valueOf(o.engine.Dec2Hex2digit(o.matrix.C).charAt(0));
            s21=String.valueOf(o.engine.Dec2Hex2digit(o.matrix.C).charAt(1));
        }
        else if(set&&mem){
            s22=String.valueOf(d1);
            s21=String.valueOf('2');
             d2=d1;d1='2';
             int memNo=o.engine.Hex2Dec(""+c4+c3+c2+c1);
             o.matrix.memory[memNo]=o.engine.Hex2Dec(""+d2+d1);
             o.set();
             if((memNo-o.matrix.beginAddress)<999&&(memNo-o.matrix.beginAddress)>=0)o.jTableAssembler[memNo-o.matrix.beginAddress][4]=""+d2+d1;

        }
        else{
        s44=String.valueOf('E');
        s43=String.valueOf('r');
        s42=String.valueOf('r');
        s41=String.valueOf('o');
        s22=String.valueOf('r');
        s21=String.valueOf('*');

        }
      
        return s44+s43+s42+s41+s22+s21;
    } 
     
      public String button3() {                                         
        if(((!set)&&mem)||go){

        s44=String.valueOf(c3);
        s43=String.valueOf(c2);
        s42=String.valueOf(c1);
        s41=String.valueOf('3');
        c4=c3;c3=c2;c2=c1;c1='3';
        if(go){
                o.matrix.PC=o.engine.Hex2Dec(""+c4+c3+c2+c1);
                o.jTextFieldBeginFrom=""+c4+c3+c2+c1;
              }

        }
        else if(reg){
            s41=String.valueOf('D');
            s22=String.valueOf(o.engine.Dec2Hex2digit(o.matrix.D).charAt(0));
                    s21=String.valueOf(o.engine.Dec2Hex2digit(o.matrix.D).charAt(1));
        }
        else if(set&&mem){
            
            s22=String.valueOf(d1);
            s21=String.valueOf('3');
             d2=d1;d1='3';
             int memNo=o.engine.Hex2Dec(""+c4+c3+c2+c1);
             o.matrix.memory[memNo]=o.engine.Hex2Dec(""+d2+d1);
             
            
             o.set();
            
             
             if((memNo-o.matrix.beginAddress)<999&&(memNo-o.matrix.beginAddress)>=0)o.jTableAssembler[memNo-o.matrix.beginAddress][4]=""+d2+d1;
             
             
             
             
        }
        else{
        s44=String.valueOf('E');
        s43=String.valueOf('r');
        s42=String.valueOf('r');
        s41=String.valueOf('o');
        s22=String.valueOf('r');
        s21=String.valueOf('*');

        }
        
        
        return s44+s43+s42+s41+s22+s21;
        
    }  
      
      public String button4() {                                         
        if(((!set)&&mem)||go){

        s44=String.valueOf(c3);
        s43=String.valueOf(c2);
        s42=String.valueOf(c1);
        s41=String.valueOf('4');
        c4=c3;c3=c2;c2=c1;c1='4';
        if(go){
                o.matrix.PC=o.engine.Hex2Dec(""+c4+c3+c2+c1);
                o.jTextFieldBeginFrom=""+c4+c3+c2+c1;
              }

        }
        else if(reg){
            s41=String.valueOf('E');
                s22=String.valueOf(o.engine.Dec2Hex2digit(o.matrix.E).charAt(0));
                s21=String.valueOf(o.engine.Dec2Hex2digit(o.matrix.E).charAt(1));

        }
        else if(set&&mem){
            s22=String.valueOf(d1);
            s21=String.valueOf('4');
             d2=d1;d1='4';
             int memNo=o.engine.Hex2Dec(""+c4+c3+c2+c1);
             o.matrix.memory[memNo]=o.engine.Hex2Dec(""+d2+d1);
             o.set();
             if((memNo-o.matrix.beginAddress)<999&&(memNo-o.matrix.beginAddress)>=0)o.jTableAssembler[memNo-o.matrix.beginAddress][4]=""+d2+d1;

        }
        else{
        s44=String.valueOf('E');
        s43=String.valueOf('r');
        s42=String.valueOf('r');
        s41=String.valueOf('o');
        s22=String.valueOf('r');
        s21=String.valueOf('*');

        }
        
        
        return s44+s43+s42+s41+s22+s21;
    }  
      
       public String button5() {                                         
        if(((!set)&&mem)||go){

        s44=String.valueOf(c3);
        s43=String.valueOf(c2);
        s42=String.valueOf(c1);
        s41=String.valueOf('5');
        c4=c3;c3=c2;c2=c1;c1='5';
        if(go){
                o.matrix.PC=o.engine.Hex2Dec(""+c4+c3+c2+c1);
                o.jTextFieldBeginFrom=""+c4+c3+c2+c1;
              }

        }
        else if(reg){
            s41=String.valueOf('H');
                    s22=String.valueOf(o.engine.Dec2Hex2digit(o.matrix.H).charAt(0));
                    s21=String.valueOf(o.engine.Dec2Hex2digit(o.matrix.H).charAt(1));
        }
        else if(set&&mem){
            s22=String.valueOf(d1);
            s21=String.valueOf('5');
             d2=d1;d1='5';
             int memNo=o.engine.Hex2Dec(""+c4+c3+c2+c1);
             o.matrix.memory[memNo]=o.engine.Hex2Dec(""+d2+d1);
             o.set();
             if((memNo-o.matrix.beginAddress)<999&&(memNo-o.matrix.beginAddress)>=0)o.jTableAssembler[memNo-o.matrix.beginAddress][4]=""+d2+d1;

        }
        else{
        s44=String.valueOf('E');
        s43=String.valueOf('r');
        s42=String.valueOf('r');
        s41=String.valueOf('o');
        s22=String.valueOf('r');
        s21=String.valueOf('*');

        }
        
         return s44+s43+s42+s41+s22+s21;
    }  
       
       
       public String button7() {                                         
        if(((!set)&&mem)||go){

        s44=String.valueOf(c3);
        s43=String.valueOf(c2);
        s42=String.valueOf(c1);
        s41=String.valueOf('7');
        c4=c3;c3=c2;c2=c1;c1='7';
        if(go){
                o.matrix.PC=o.engine.Hex2Dec(""+c4+c3+c2+c1);
                o.jTextFieldBeginFrom=""+c4+c3+c2+c1;
              }

        }
        else if(reg){
            String s=o.engine.Dec2Hex(o.matrix.H*256+o.matrix.L);
            s44=String.valueOf(s.charAt(0));
            s43=String.valueOf(s.charAt(1));
            s42=String.valueOf(s.charAt(2));
            s41=String.valueOf(s.charAt(3));
                    s22=String.valueOf(o.engine.Dec2Hex2digit(o.matrix.memory[o.matrix.H*256+o.matrix.L]).charAt(0));
                    s21=String.valueOf(o.engine.Dec2Hex2digit(o.matrix.memory[o.matrix.H*256+o.matrix.L]).charAt(1));

        }
        else if(set&&mem){
            s22=String.valueOf(d1);
            s21=String.valueOf('7');
             d2=d1;d1='7';
             int memNo=o.engine.Hex2Dec(""+c4+c3+c2+c1);
             o.matrix.memory[memNo]=o.engine.Hex2Dec(""+d2+d1);
             o.set();
             if((memNo-o.matrix.beginAddress)<999&&(memNo-o.matrix.beginAddress)>=0)o.jTableAssembler[memNo-o.matrix.beginAddress][4]=""+d2+d1;

        }
        else{
        s44=String.valueOf('E');
        s43=String.valueOf('r');
        s42=String.valueOf('r');
        s41=String.valueOf('o');
        s22=String.valueOf('r');
        s21=String.valueOf('*');

        }
        
      
         return s44+s43+s42+s41+s22+s21;
    }                                        

   public String button9() {                                        
        if(((!set)&&mem)||go){
        s44=String.valueOf(c3);
        s43=String.valueOf(c2);
        s42=String.valueOf(c1);
        s41=String.valueOf('9');
        c4=c3;c3=c2;c2=c1;c1='9';
        if(go){
                o.matrix.PC=o.engine.Hex2Dec(""+c4+c3+c2+c1);
                o.jTextFieldBeginFrom=""+c4+c3+c2+c1;
              }

        }
        else if(reg){
            String s=o.engine.Dec2Hex(o.matrix.PC);
            s44=String.valueOf(s.charAt(0));
            s43=String.valueOf(s.charAt(1));
            s42=String.valueOf(s.charAt(2));
            s41=String.valueOf(s.charAt(3));
            s22=String.valueOf(o.engine.Dec2Hex2digit(o.matrix.memory[o.matrix.PC]).charAt(0));
            s21=String.valueOf(o.engine.Dec2Hex2digit(o.matrix.memory[o.matrix.PC]).charAt(1));

        }
        else if(set&&mem){
            s22=String.valueOf(d1);
            s21=String.valueOf('9');
             d2=d1;d1='9';
             int memNo=o.engine.Hex2Dec(""+c4+c3+c2+c1);
             o.matrix.memory[memNo]=o.engine.Hex2Dec(""+d2+d1);
             o.set();
             if((memNo-o.matrix.beginAddress)<999&&(memNo-o.matrix.beginAddress)>=0)o.jTableAssembler[memNo-o.matrix.beginAddress][4]=""+d2+d1;

        }
        else{
        s44=String.valueOf('E');
        s43=String.valueOf('r');
        s42=String.valueOf('r');
        s41=String.valueOf('o');
        s22=String.valueOf('r');
        s21=String.valueOf('*');

        }
       
         return s44+s43+s42+s41+s22+s21;
    }                                       

   public String buttonA() {                                        
        if(((!set)&&mem)||go){
        s44=String.valueOf(c3);
        s43=String.valueOf(c2);
        s42=String.valueOf(c1);
        s41=String.valueOf('A');
        c4=c3;c3=c2;c2=c1;c1='A';
        if(go){
                o.matrix.PC=o.engine.Hex2Dec(""+c4+c3+c2+c1);
                o.jTextFieldBeginFrom=""+c4+c3+c2+c1;
              }

        }
        else if(reg){

        }
        else if(set&&mem){
            s22=String.valueOf(d1);
            s21=String.valueOf('A');
             d2=d1;d1='A';
             int memNo=o.engine.Hex2Dec(""+c4+c3+c2+c1);
             o.matrix.memory[memNo]=o.engine.Hex2Dec(""+d2+d1);
             o.set();
             if((memNo-o.matrix.beginAddress)<999&&(memNo-o.matrix.beginAddress)>=0)o.jTableAssembler[memNo-o.matrix.beginAddress][4]=""+d2+d1;

        }
        else{
        s44=String.valueOf('E');
        s43=String.valueOf('r');
        s42=String.valueOf('r');
        s41=String.valueOf('o');
        s22=String.valueOf('r');
        s21=String.valueOf('*');

        }
      
         return s44+s43+s42+s41+s22+s21;
    }                                       

    public String buttonB() {                                        
        if(((!set)&&mem)||go){
        s44=String.valueOf(c3);
        s43=String.valueOf(c2);
        s42=String.valueOf(c1);
        s41=String.valueOf('B');
        c4=c3;c3=c2;c2=c1;c1='B';
        if(go){
                o.matrix.PC=o.engine.Hex2Dec(""+c4+c3+c2+c1);
                o.jTextFieldBeginFrom=""+c4+c3+c2+c1;
              }

        }
        else if(reg){

        }
        else if(set&&mem){
            s22=String.valueOf(d1);
            s21=String.valueOf('B');
             d2=d1;d1='B';
             int memNo=o.engine.Hex2Dec(""+c4+c3+c2+c1);
             o.matrix.memory[memNo]=o.engine.Hex2Dec(""+d2+d1);
             o.set();
             if((memNo-o.matrix.beginAddress)<999&&(memNo-o.matrix.beginAddress)>=0)o.jTableAssembler[memNo-o.matrix.beginAddress][4]=""+d2+d1;

        }
        else{
        s44=String.valueOf('E');
        s43=String.valueOf('r');
        s42=String.valueOf('r');
        s41=String.valueOf('o');
        s22=String.valueOf('r');
        s21=String.valueOf('*');

        }
        
    
         return s44+s43+s42+s41+s22+s21;
    }                                       

    public String buttonC() {                                        
        if(((!set)&&mem)||go){
        s44=String.valueOf(c3);
        s43=String.valueOf(c2);
        s42=String.valueOf(c1);
        s41=String.valueOf('C');
        c4=c3;c3=c2;c2=c1;c1='C';
        if(go){
                o.matrix.PC=o.engine.Hex2Dec(""+c4+c3+c2+c1);
                o.jTextFieldBeginFrom=""+c4+c3+c2+c1;
              }

        }
        else if(reg){

        }
        else if(set&&mem){
            s22=String.valueOf(d1);
            s21=String.valueOf('C');
             d2=d1;d1='C';
             int memNo=o.engine.Hex2Dec(""+c4+c3+c2+c1);
             o.matrix.memory[memNo]=o.engine.Hex2Dec(""+d2+d1);
             o.set();
             if((memNo-o.matrix.beginAddress)<999&&(memNo-o.matrix.beginAddress)>=0)o.jTableAssembler[memNo-o.matrix.beginAddress][4]=""+d2+d1;

        }
        else{
        s44=String.valueOf('E');
        s43=String.valueOf('r');
        s42=String.valueOf('r');
        s41=String.valueOf('o');
        s22=String.valueOf('r');
        s21=String.valueOf('*');

        }
        
       
         return s44+s43+s42+s41+s22+s21;
    }                                       

    public String buttonD() {                                        
        if(((!set)&&mem)||go){
        s44=String.valueOf(c3);
        s43=String.valueOf(c2);
        s42=String.valueOf(c1);
        s41=String.valueOf('D');
        c4=c3;c3=c2;c2=c1;c1='D';
        if(go){
                o.matrix.PC=o.engine.Hex2Dec(""+c4+c3+c2+c1);
                o.jTextFieldBeginFrom=""+c4+c3+c2+c1;
              }

        }
        else if(reg){

        }
        else if(set&&mem){
            s22=String.valueOf(d1);
            s21=String.valueOf('D');
             d2=d1;d1='D';
             int memNo=o.engine.Hex2Dec(""+c4+c3+c2+c1);
             o.matrix.memory[memNo]=o.engine.Hex2Dec(""+d2+d1);
             o.set();
             if((memNo-o.matrix.beginAddress)<999&&(memNo-o.matrix.beginAddress)>=0)o.jTableAssembler[memNo-o.matrix.beginAddress][4]=""+d2+d1;

        }
        else{
        s44=String.valueOf('E');
        s43=String.valueOf('r');
        s42=String.valueOf('r');
        s41=String.valueOf('o');
        s22=String.valueOf('r');
        s21=String.valueOf('*');

        }
     
         return s44+s43+s42+s41+s22+s21;
    }                                       

    public String buttonE() {                                        
        if(((!set)&&mem)||go){
        s44=String.valueOf(c3);
        s43=String.valueOf(c2);
        s42=String.valueOf(c1);
        s41=String.valueOf('E');
        c4=c3;c3=c2;c2=c1;c1='E';
        if(go){
                o.matrix.PC=o.engine.Hex2Dec(""+c4+c3+c2+c1);
                o.jTextFieldBeginFrom=""+c4+c3+c2+c1;
              }

        }
        else if(reg){

        }
        else if(set&&mem){
            s22=String.valueOf(d1);
            s21=String.valueOf('E');
             d2=d1;d1='E';
             int memNo=o.engine.Hex2Dec(""+c4+c3+c2+c1);
             o.matrix.memory[memNo]=o.engine.Hex2Dec(""+d2+d1);
             o.set();
             if((memNo-o.matrix.beginAddress)<999&&(memNo-o.matrix.beginAddress)>=0)o.jTableAssembler[memNo-o.matrix.beginAddress][4]=""+d2+d1;

        }
        else{
        s44=String.valueOf('E');
        s43=String.valueOf('r');
        s42=String.valueOf('r');
        s41=String.valueOf('o');
        s22=String.valueOf('r');
        s21=String.valueOf('*');

        }
       
         return s44+s43+s42+s41+s22+s21;
    }                                       

   public String buttonF() {                                        
        if(((!set)&&mem)||go){
        s44=String.valueOf(c3);
        s43=String.valueOf(c2);
        s42=String.valueOf(c1);
        s41=String.valueOf('F');
        c4=c3;c3=c2;c2=c1;c1='F';
        if(go){
                o.matrix.PC=o.engine.Hex2Dec(""+c4+c3+c2+c1);
                o.jTextFieldBeginFrom=""+c4+c3+c2+c1;
              }

        }
        else if(reg){

        }
        else if(set&&mem){
            s22=String.valueOf(d1);
            s21=String.valueOf('F');
             d2=d1;d1='F';
             int memNo=o.engine.Hex2Dec(""+c4+c3+c2+c1);
             o.matrix.memory[memNo]=o.engine.Hex2Dec(""+d2+d1);
             o.set();
             if((memNo-o.matrix.beginAddress)<999&&(memNo-o.matrix.beginAddress)>=0)o.jTableAssembler[memNo-o.matrix.beginAddress][4]=""+d2+d1;

        }
        else{
        s44=String.valueOf('E');
        s43=String.valueOf('r');
        s42=String.valueOf('r');
        s41=String.valueOf('o');
        s22=String.valueOf('r');
        s21=String.valueOf('*');

        }
        
         return s44+s43+s42+s41+s22+s21;
         
         
    }   
   
   
   public String buttonExec() {                                           
//System.out.println("EXEUTE PRESSED_________________________________________________________");
        //o.viewWorkSpace();
        o.disAssemble();
        o.jButtonRun();
        //exec.execute(this);
        o.run();
        
        
        
        return "DONE";
    }
   
   
   public static void dis(Assembler o){
       for(int i=0;i<2;i++){
            for(int j=0;j<17;j++){
                System.out.print(o.jTableMemory[i][j]+" ");
            }
            System.out.println();
        }
       System.out.println("\n");
       
       for(int i=0;i<1000 && o.jTableAssembler[i][4]!=null;i++){
           for(int j=0;j<8;j++){
           System.out.print(o.jTableAssembler[i][j]+" ");
           }
           System.out.println();
       }
       System.out.println("\n");
   }
   
    public static void main(String[] ar){
        Assembler o=new Assembler();
        trainer t=new trainer(o);
        t.reset();
        t.buttonMemActionPerformed();
        t.button5();
        t.next();
        t.button3();
        t.buttonE();
        t.next();
        t.button0();
        t.reset();
        t.buttonGoActionPerformed();
        t.button5();
        t.buttonExec();
        
        
        
    }
}


