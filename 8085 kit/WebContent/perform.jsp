<%-- 
    Document   : perform
    Created on : 24-Mar-2019, 1:32:33 PM
    Author     : raushan
--%>



       <%@page import="files.*"%>
       <%          Assembler o=(Assembler)session.getAttribute("o");
           trainer t=(trainer)session.getAttribute("t");
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
            out.print(t.buttonExec());
            
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
       
        
               session.setAttribute("o", o);
               session.setAttribute("t", t);
       %>

