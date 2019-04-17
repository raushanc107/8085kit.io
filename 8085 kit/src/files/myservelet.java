/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author raush
 */
public class myservelet extends HttpServlet {

  Assembler o=new Assembler();
trainer t=new trainer(o);

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


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       try(PrintWriter out=response.getWriter()){
            String button = request.getParameter("name");
        if ("reset".equals(button)) {
            out.print(t.reset());
            
        }
        else if("next".equals(button)){
            out.print(t.next());
          
       
        }
        else if("strngpre".equals(button)){
            out.print(t.buttonPrevActionPerformed());
           
       
        }
        else if("delgo".equals(button)){
            out.print(t.buttonGoActionPerformed());
      
            
        }
        else if("exregsi".equals(button)){
            out.print(t.buttonRegActionPerformed());
       
        }
        else if("relexmem".equals(button)){
            out.print(t.buttonMemActionPerformed());
    
            
       
        }
        else if("6".equals(button)){
            out.print(t.button6());
     
       
        }
        else if("8".equals(button)){
            out.print(t.button8());
       
       
        }
        else if("0".equals(button)){
            out.print(t.button0());
            /*
            out.print("\n");
            for(int i=0;i<2;i++){
            for(int j=0;j<17;j++){
                out.print(o.jTableMemory[i][j]+" ");
            }
            out.println();
        }
       out.println("\n");
       
       for(int i=0;i<1000 && o.jTableAssembler[i][4]!=null;i++){
           for(int j=0;j<8;j++){
         out.print(o.jTableAssembler[i][j]+" ");
           }
           out.println();
       }
        out.println("\n");
       
       */
        }
            
        else if("1".equals(button)){
            out.print(t.button1());
            
          /*
            out.print("\n");
            for(int i=0;i<2;i++){
            for(int j=0;j<17;j++){
                out.print(o.jTableMemory[i][j]+" ");
            }
            out.println();
        }
       out.println("\n");
       
       for(int i=0;i<1000 && o.jTableAssembler[i][4]!=null;i++){
           for(int j=0;j<8;j++){
         out.print(o.jTableAssembler[i][j]+" ");
           }
           out.println();
       }
        out.println("\n");
       */
       
        }
        else if("2".equals(button)){
            out.print(t.button2());
            /*
            out.print("\n");
            for(int i=0;i<2;i++){
            for(int j=0;j<17;j++){
                out.print(o.jTableMemory[i][j]+" ");
            }
            out.println();
        }
       out.println("\n");
       
       for(int i=0;i<1000 && o.jTableAssembler[i][4]!=null;i++){
           for(int j=0;j<8;j++){
         out.print(o.jTableAssembler[i][j]+" ");
           }
           out.println();
       }
        out.println("\n");
       */
       
        }
        else if("3".equals(button)){
            out.print(t.button3());
            /*
            out.print("\n");
            for(int i=0;i<2;i++){
            for(int j=0;j<17;j++){
                out.print(o.jTableMemory[i][j]+" ");
            }
            out.println();
        }
       out.println("\n");
       
       for(int i=0;i<1000 && o.jTableAssembler[i][4]!=null;i++){
           for(int j=0;j<8;j++){
         out.print(o.jTableAssembler[i][j]+" ");
           }
           out.println();
       }
        out.println("\n");
       */
       
        }
        else if("4".equals(button)){
            out.print(t.button4());
            /*
            out.print("\n");
            for(int i=0;i<2;i++){
            for(int j=0;j<17;j++){
                out.print(o.jTableMemory[i][j]+" ");
            }
            out.println();
        }
       out.println("\n");
       
       for(int i=0;i<1000 && o.jTableAssembler[i][4]!=null;i++){
           for(int j=0;j<8;j++){
         out.print(o.jTableAssembler[i][j]+" ");
           }
           out.println();
       }
        out.println("\n");
       */
       
        }
        else if("5".equals(button)){
            out.print(t.button5());
            /*
            out.print("\n");
            for(int i=0;i<2;i++){
            for(int j=0;j<17;j++){
                out.print(o.jTableMemory[i][j]+" ");
            }
            out.println();
        }
       out.println("\n");
       
       for(int i=0;i<1000 && o.jTableAssembler[i][4]!=null;i++){
           for(int j=0;j<8;j++){
         out.print(o.jTableAssembler[i][j]+" ");
           }
           out.println();
       }
        out.println("\n");
       */
       
        }
        else if("7".equals(button)){
            out.print(t.button7());
            /*
            out.print("\n");
            for(int i=0;i<2;i++){
            for(int j=0;j<17;j++){
                out.print(o.jTableMemory[i][j]+" ");
            }
            out.println();
        }
       out.println("\n");
       
       for(int i=0;i<1000 && o.jTableAssembler[i][4]!=null;i++){
           for(int j=0;j<8;j++){
         out.print(o.jTableAssembler[i][j]+" ");
           }
           out.println();
       }
        out.println("\n");
       */
       
        }
        else if("9".equals(button)){
            out.print(t.button9());
            /*
            out.print("\n");
            for(int i=0;i<2;i++){
            for(int j=0;j<17;j++){
                out.print(o.jTableMemory[i][j]+" ");
            }
            out.println();
        }
       out.println("\n");
       
       for(int i=0;i<1000 && o.jTableAssembler[i][4]!=null;i++){
           for(int j=0;j<8;j++){
         out.print(o.jTableAssembler[i][j]+" ");
           }
           out.println();
       }
        out.println("\n");
       */
       
        }
        else if("A".equals(button)){
            out.print(t.buttonA());
            /*
            out.print("\n");
            for(int i=0;i<2;i++){
            for(int j=0;j<17;j++){
                out.print(o.jTableMemory[i][j]+" ");
            }
            out.println();
        }
       out.println("\n");
       
       for(int i=0;i<1000 && o.jTableAssembler[i][4]!=null;i++){
           for(int j=0;j<8;j++){
         out.print(o.jTableAssembler[i][j]+" ");
           }
           out.println();
       }
        out.println("\n");
       
       */
        }
        else if("B".equals(button)){
            out.print(t.buttonB());
            /*
            out.print("\n");
            for(int i=0;i<2;i++){
            for(int j=0;j<17;j++){
                out.print(o.jTableMemory[i][j]+" ");
            }
            out.println();
        }
       out.println("\n");
       
       for(int i=0;i<1000 && o.jTableAssembler[i][4]!=null;i++){
           for(int j=0;j<8;j++){
         out.print(o.jTableAssembler[i][j]+" ");
           }
           out.println();
       }
        out.println("\n");
       */
       
        }
        else if("C".equals(button)){
            out.print(t.buttonC());
            /*
           out.print("\n");
            for(int i=0;i<2;i++){
            for(int j=0;j<17;j++){
                out.print(o.jTableMemory[i][j]+" ");
            }
            out.println();
        }
       out.println("\n");
       
       for(int i=0;i<1000 && o.jTableAssembler[i][4]!=null;i++){
           for(int j=0;j<8;j++){
         out.print(o.jTableAssembler[i][j]+" ");
           }
           out.println();
       }
        out.println("\n");
       */
       
        }
        else if("D".equals(button)){
            out.print(t.buttonD());
            
            /*
            out.print("\n");
            for(int i=0;i<2;i++){
            for(int j=0;j<17;j++){
                out.print(o.jTableMemory[i][j]+" ");
            }
            out.println();
        }
       out.println("\n");
       
       for(int i=0;i<1000 && o.jTableAssembler[i][4]!=null;i++){
           for(int j=0;j<8;j++){
         out.print(o.jTableAssembler[i][j]+" ");
           }
           out.println();
       }
        out.println("\n");
       */
       
        }
        else if("E".equals(button)){
            out.print(t.buttonE());
            /*
            out.print("\n");
            for(int i=0;i<2;i++){
            for(int j=0;j<17;j++){
                out.print(o.jTableMemory[i][j]+" ");
            }
            out.println();
        }
       out.println("\n");
       
       for(int i=0;i<1000 && o.jTableAssembler[i][4]!=null;i++){
           for(int j=0;j<8;j++){
         out.print(o.jTableAssembler[i][j]+" ");
           }
           out.println();
       }
        out.println("\n");
       
       */
        }
        else if("F".equals(button)){
            out.print(t.buttonF());
            
            /*
            out.print("\n");
            for(int i=0;i<2;i++){
            for(int j=0;j<17;j++){
                out.print(o.jTableMemory[i][j]+" ");
            }
            out.println();
        }
       out.println("\n");
       
       for(int i=0;i<1000 && o.jTableAssembler[i][4]!=null;i++){
           for(int j=0;j<8;j++){
         out.print(o.jTableAssembler[i][j]+" ");
           }
           out.println();
       }
        out.println("\n");
       
       */
        }
        else if("exec".equals(button)){
            t.buttonExec();
            
          /*  out.print("______________________________________________________________________________________");
        
            
            out.print("\n memory table \n");
            
            
            for(int i=0;i<2;i++){
            for(int j=0;j<17;j++){
                out.print(o.jTableMemory[i][j]+" ");
            }
            out.println();
        }
       out.println("\n assembler table \n");
       
       for(int i=0;i<1000 && o.jTableAssembler[i][4]!=null;i++){
           for(int j=0;j<8;j++){
         out.print(o.jTableAssembler[i][j]+" ");
           }
           out.println();
       }
        out.println("\n register table \n");
       
        
        for(int i=0;i<8;i++){
            for(int j=0;j<10;j++){
                out.print(o.jTableRegister[i][j]+" ");
            }
            out.print("\n");
        }
        
        out.print("\n flag register table \n");
        
        for(int i=0;i<10;i++){
            out.print(o.jTableFlagregister[0][i]+" ");
        }
        out.print("\n counter table \n");
        
        for(int i=0;i<6;i++){
            for(int j=0;j<2;j++){
                out.print(o.jTableCounter[i][j]+" ");
            }
            out.print("\n");
        }
        
        out.print("\n Interrupt table \n");
        
        for(int i=0;i<8;i++){
            out.print(o.jTableInterrupt[0][i]);
        }
        
        out.print("\n port table \n");
        
        for(int i=0;i<16;i++){
            for(int j=0;j<17;j++){
                out.print(o.jTablePort[i][j]+" ");
            }
            out.print("\n");
        }
        
        out.print("______________________________________________________________________________________");*/
        
       
        }
        
        
        
        
        
        
        
        
        
       else{
               out.print(button);
               }
       }
    }
    
   
}
