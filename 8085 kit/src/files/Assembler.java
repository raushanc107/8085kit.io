package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.ExecutorService;



public class Assembler {
    String jButtonStop="stop";
    public AssemblerEngine engine;
    Matrix matrix;
    Disassembler disassembler;
    PPI8255 ppi8255;
    Preprocessor preprocessor;
    String textEditor;
int tableState=0;
    String path="";
    boolean closeStateCall=false;
    float[] speed=new float[4];
    int timingDiagramX = 0;
    
    String recover="";
    String[] comments=new String[1000];
    String[] macro=new String[1000];
    int oIndex=0;
    boolean stop=false;
    boolean pause=false;
    boolean properShutdown=false;
    int stopAtIndex=207;
    int memShift=0;
    
    int continueFrom=0;
String fileSeparator=System.getProperty("file.separator");


public Assembler() {

        matrix = new Matrix(this);
        engine = new AssemblerEngine(matrix);
        ppi8255=new PPI8255(this);
        preprocessor = new Preprocessor();
        disassembler = new Disassembler(this);
        
        setParameters();
        matrix.PC=engine.Hex2Dec(engine.HexAutoCorrect4digit(jTextFieldMemBegin));
        matrix.beginAddress=engine.Hex2Dec(engine.HexAutoCorrect4digit(jTextFieldMemBegin));
        matrix.stopAddress=engine.Hex2Dec(engine.HexAutoCorrect4digit(jTextFieldMemStop));
     /*   //textEditor=new TextEditor(this);
        //initComponents();
      /// jTabbedPaneAssemblerEditor.removeAll();
        //jTabbedPaneAssemblerEditor.addTab("Assembler",jScrollPane9);
        //jTabbedPaneAssemblerEditor.addTab("Disassembler",jScrollPane5);
        
        //
       
        //sampleCode();
        //jScrollPane16.setVisible(true);
        //jMenu12.setVisible(false);
      
        //jTabbedPaneInterface.setVisible(true);
        //jTabbedPaneInterface.addTab("I/O Port Editor", jScrollPane4);
        */
        
        
   //___________________________________________________________________________________________________________________________     
       //jTableAssembler.setRowSelectionAllowed(true);
        //jTableAssembler.setRowSelectionInterval(0, 1);
    //_____________________________________________________________________________________________________________________   
    

}

public void setParameters()
    {
       
       speed[0]=0;speed[1]=0;speed[2]=0;speed[3]=1;
        for (int i = 0; i < 3; i++) jTableNoConverter[0][i]=String.valueOf(0);
        loadSettings();
        if(path.length()>0)path=path.substring(0,path.length());
        set();
    }


public void loadSettings()
    {
        String filepath=System.getProperty("user.dir")+fileSeparator+"settings.dat";
        String line="";
        try {
            BufferedReader in = new BufferedReader(new FileReader(filepath));
            if((line=in.readLine())!=null)jTextFieldMemBegin=line;
            if((line=in.readLine())!=null)jTextFieldMemStop=line;
            if((line=in.readLine())!=null)jTextFieldBeginFrom=line;
            if((line=in.readLine())!=null)path=line;
            if((line=in.readLine())!=null)stopAtIndex=Integer.parseInt(line);
            in.close();
        }
        catch(Exception e){}
        
        
            jTextFieldMemBeginActionPerformed();

    }


private void jTextFieldMemBeginActionPerformed() {                                                   
       jTextFieldMemBegin=engine.HexAutoCorrect4digit(jTextFieldMemBegin);
       jTextFieldMemStop=engine.HexAutoCorrect4digit(jTextFieldMemStop);
       jTextFieldBeginFrom=engine.HexAutoCorrect4digit(jTextFieldMemBegin);
       try {
           int lower = engine.Hex2Dec(jTextFieldMemBegin);
           int upper = engine.Hex2Dec(jTextFieldMemStop);
           if(lower>upper)System.out.println("Upper range cannot be lower than the lower range.");
           int n = (upper - lower + 1) / 16;
           if (n % 16 != 0) {
               n = n - (n % 16) + 16;
           }
           //jTableMemory=new String[n][17];
           /*
           jTableMemory.setModel(new javax.swing.table.DefaultTableModel(
                   new Object[n][17],
                   new String[]{
                       "        ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"
                   }) {

               Class[] types = new Class[]{
                   java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
               };
               boolean[] canEdit = new boolean[]{
                   false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
               };

               public Class getColumnClass(int columnIndex) {
                   return types[columnIndex];
               }

               public boolean isCellEditable(int rowIndex, int columnIndex) {
                   return canEdit[columnIndex];
               }
           });*/
           
           //jTableMemory.getColumnModel().getColumn(0).setPreferredWidth(330);
             matrix.beginAddress=engine.Hex2Dec(engine.HexAutoCorrect4digit(jTextFieldMemBegin));
             matrix.stopAddress=engine.Hex2Dec(engine.HexAutoCorrect4digit(jTextFieldMemStop));
               setMemory();

       }catch(Exception e){System.out.println("Memory address should be in the format XXX0");jTextFieldMemBegin="C000";setMemory();}


}        




  public void set()
    {
        setIOPort();
        setMemory();
        setResister();
        ppi8255.set();
       //jRadioButtonUsedMemoryLocationActionPerformed();

    }
  
   public void setIOPort() {
        for (int i = 0,row=0,col=1; i < 256; i++, col++) {
            jTablePort[row][col]= engine.Dec2Hex2digit(matrix.port[i]);
            if(col==16){col=0;row++;}
        }
        for (int i = 0; i < 16; i++) {
            jTablePort[i][0]="   "+engine.Dec2Hex2digit(i*16);
        }
    }
   
   
   
    public void setMemory()
   {
       try {
           int lower = engine.Hex2Dec(jTextFieldMemBegin);
           int upper = engine.Hex2Dec(jTextFieldMemStop);
           int n = (upper - lower + 1) / 16;
           if (n % 16 != 0) {
               n = n - (n % 16) + 16;
           }
           //System.out.println(n);
           
           /*jTableMemory.setModel(new javax.swing.table.DefaultTableModel(
                   new Object[n][17],
                   new String[]{
                       "        ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"
                   }) {

               Class[] types = new Class[]{
                   java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
               };
               boolean[] canEdit = new boolean[]{
                   false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
               };

               public Class getColumnClass(int columnIndex) {
                   return types[columnIndex];
               }

               public boolean isCellEditable(int rowIndex, int columnIndex) {
                   return canEdit[columnIndex];
               }
           });
           */
           
           //jTableMemory.getColumnModel().getColumn(0).setPreferredWidth(330);
       }catch(Exception e){}
       
       
       
       int lower=engine.Hex2Dec(jTextFieldMemBegin);
       int upper=engine.Hex2Dec(jTextFieldMemStop);
       int n = (upper - lower+1)/16;
       String s = "";
       int l=lower;
       for (int i = 0; i < n; i++, l+=16) {
           s = engine.Dec2Hex(l);
           jTableMemory[i][0]=s;
           
       }
      
       for(int i=lower,row=0,col=1;i<=upper;i++,col++)
       {

           jTableMemory[row][col]=engine.Dec2Hex2digit(matrix.memory[i]);
           if(col==16){col=0;row++;}
           
       }
       sortmemtable();
       
       

       
       tableState = 0;
   }
    
    
    private void sortmemtable() {//GEN-FIRST:event_jRadioButtonUsedMemoryLocationActionPerformed

       int lower = engine.Hex2Dec(jTextFieldMemBegin);
       int upper = engine.Hex2Dec(jTextFieldMemStop);
       
       for(int i=0,row=0;i<=(upper-lower);i++)
       {
           if(matrix.memory[i+lower]!=0)
           {
           jsTableMemory[row][0]="                    "+engine.Dec2Hex(i+lower);
           jsTableMemory[row][1]="                          "+engine.Dec2Hex2digit(matrix.memory[i+lower]);
           row++;
           }
       }
     
    

}
    
    
    
    
     private void setResister() {
        String s;
        jTableRegister[0][1]="       " + engine.Dec2Hex2digit(matrix.A);
        s = engine.Dec2Bin(matrix.A);
        for (int i = 0; i < 8; i++) {
            jTableRegister[0][i+2]=s.charAt(i) + "  ";
        }

        jTableRegister[1][1]="       " + engine.Dec2Hex2digit(matrix.B);
        s = engine.Dec2Bin(matrix.B);
        for (int i = 0; i < 8; i++) {
            jTableRegister[1][i+2]=s.charAt(i) + "  ";
        }

        jTableRegister[2][1]="       " + engine.Dec2Hex2digit(matrix.C);
        s = engine.Dec2Bin(matrix.C);
        for (int i = 0; i < 8; i++) {
            jTableRegister[2][i+2]=s.charAt(i) + "  ";
        }

        jTableRegister[3][1]="       " + engine.Dec2Hex2digit(matrix.D);
        s = engine.Dec2Bin(matrix.D);
        for (int i = 0; i < 8; i++) {
            jTableRegister[3][i+2]=s.charAt(i) + "  ";
        }

        jTableRegister[4][1]="       " + engine.Dec2Hex2digit(matrix.E);
        s = engine.Dec2Bin(matrix.E);
        for (int i = 0; i < 8; i++) {
            jTableRegister[4][i+2]=s.charAt(i) + "  ";
        }

        jTableRegister[5][1]="       " + engine.Dec2Hex2digit(matrix.H);
        s = engine.Dec2Bin(matrix.H);
        for (int i = 0; i < 8; i++) {
            jTableRegister[5][i+2]=s.charAt(i) + "  ";
        }

        jTableRegister[6][1]="       " + engine.Dec2Hex2digit(matrix.L);
        s = engine.Dec2Bin(matrix.L);
        for (int i = 0; i < 8; i++) {
            jTableRegister[6][i+2]=s.charAt(i) + "  ";
        }
        if((256*matrix.H+matrix.L)<65536  ){
        jTableRegister[7][1]="       " + engine.Dec2Hex2digit(matrix.memory[256*matrix.H+matrix.L]);
        s = engine.Dec2Bin(matrix.memory[256*matrix.H+matrix.L]);
        for (int i = 0; i < 8; i++) {
            jTableRegister[7][i+2]=s.charAt(i) + "  ";
        }}
        else{
            jTableRegister[7][1]="       " + engine.Dec2Hex2digit(0);
        s = engine.Dec2Bin(0);
        for (int i = 0; i < 8; i++) {
            jTableRegister[7][i+2]=s.charAt(i) + "  ";
        }

        }

        jTableFlagregister[0][1]="       " + engine.Dec2Hex2digit(matrix.F);
        s = engine.Dec2Bin(matrix.F);
        for (int i = 0; i < 8; i++) {
            jTableFlagregister[0][i+2]=s.charAt(i) + "  ";
        }

        jTableCounter[0][1]="                  " + engine.Dec2Hex(matrix.SP);
        jTableCounter[1][1]="                  " + engine.Dec2Hex2digit(matrix.H) + engine.Dec2Hex2digit(matrix.L);
        jTableCounter[2][1]="                  " + engine.Dec2Hex2digit(matrix.A) + engine.Dec2Hex2digit(matrix.F);
        jTableCounter[3][1]="                  " + engine.Dec2Hex(matrix.PC);
        jTableCounter[4][1]="                  " + matrix.clockCycleCounter;
        jTableCounter[5][1]="                  " + matrix.instructionCounter;

        int SOD;
        SOD=(matrix.SOD&matrix.SDE);
        jTableInterrupt[0][0]="       "+SOD;
        jTableInterrupt[0][1]="       "+matrix.SID;
        jTableInterrupt[0][2]="       "+matrix.INTR;
        jTableInterrupt[0][3]="       "+matrix.TRAP;
        jTableInterrupt[0][4]="       "+matrix.R75;
        jTableInterrupt[0][5]="       "+matrix.R65;
        jTableInterrupt[0][6]="       "+matrix.R55;

        jTableSIM[0][0]="    "+matrix.SOD;
        jTableSIM[0][1]="    "+matrix.SDE;
        jTableSIM[0][2]="    "+matrix.D1;
        jTableSIM[0][3]="    "+matrix.RR75;
        jTableSIM[0][4]="    "+matrix.MSE;
        jTableSIM[0][5]="    "+matrix.M75;
        jTableSIM[0][6]="    "+matrix.M65;
        jTableSIM[0][7]="    "+matrix.M55;

        jTableRIM[0][0]="    "+matrix.SID;
        jTableRIM[0][1]="    "+matrix.R75;
        jTableRIM[0][2]="    "+matrix.R65;
        jTableRIM[0][3]="    "+matrix.R55;
        jTableRIM[0][4]="    "+matrix.IE;
        jTableRIM[0][5]="    "+matrix.M75;
        jTableRIM[0][6]="    "+matrix.M65;
        jTableRIM[0][7]="    "+matrix.M55;
        
        
    }
     
     private void jRadioButtonUsedMemoryLocationActionPerformed() {                                                               

       int lower = engine.Hex2Dec(jTextFieldMemBegin);
       int upper = engine.Hex2Dec(jTextFieldMemStop);
       
       for(int i=0,row=0;i<=(upper-lower);i++)
       {
           if(matrix.memory[i+lower]!=0)
           {
           jTableMemory[row][0]="                    "+engine.Dec2Hex(i+lower);
           jTableMemory[row][1]="                          "+engine.Dec2Hex2digit(matrix.memory[i+lower]);
           row++;
           }
       }
      
       tableState=1;

}
     
     
      public void disAssemble()
   {
      int begin=engine.Hex2Dec(jTextFieldBeginFrom);
       System.out.println("begin value---------------:::  "+begin);
      int index=0,n=begin;
      String temp="",value="";
      jump:
      for(int i=begin,x=0;i<jTableAssembler.length && jTableAssembler[i][4]!=null;begin++,i++)
      {
            jTableAssembler[i][1]="  "+engine.Dec2Hex(begin);
            index=engine.Hex2Dec(jTableAssembler[i][4].toString());
            if(index<255)temp=engine.S[index];
            else break jump;
            x=engine.getBytesFromMnemonics(temp);
            value="";
            if(engine.S[index].equalsIgnoreCase("NOP")){jTableAssembler[i][0]="X";}
            else jTableAssembler[i][0]="√";

            jTableAssembler[i][5]="       "+engine.I[index][0];
            jTableAssembler[i][6]="        "+engine.I[index][1];
            jTableAssembler[i][7]="        "+engine.I[index][2];
            jTableAssembler[i][4]="      "+engine.HexAutoCorrect2digit(jTableAssembler[i][4].toString().toUpperCase().trim());

            for(int j=1;j<x;j++)
            {
                            begin++;
                            i++;
                            jTableAssembler[i][1]="  "+engine.Dec2Hex(begin);
                            try{
                            value=jTableAssembler[i][4].toString().toUpperCase().trim()+value;
                            }catch(Exception e)
                            {
                                value="00"+value;
                                jTableAssembler[i][4]="00";

                            }
                            temp=temp.substring(0, temp.length()-2*j)+value;
                            jTableAssembler[i][4]="      "+engine.HexAutoCorrect2digit(jTableAssembler[i][4].toString().toUpperCase().trim());
            }
            jTableAssembler[i-x+1][3]="  "+temp;
      }
      for(int i=0;jTableAssembler[i][4]!=null;i++)
      {
          matrix.memory[i+n]=engine.Hex2Dec(jTableAssembler[i][4].toString());
      }
      
      
       System.out.println("before memory set");
      setMemory();
       System.err.println("after memory set");
      //jTabbedPaneAssemblerEditor.setSelectedIndex(1);
      //jButtonAssemble.setVisible(false);
      //jButtonDisassemble.setVisible(true);

   }
      
      
       public void jButtonRun() {                                           

       //jButtonStop.setVisible(true);
       //jButtonRun.setVisible(false);
       //jButtonStep.setVisible(false);
       //jLabelErrorHang.setVisible(false);
       stop=false;
       //ExecutorService exec = Executors.newCachedThreadPool();
       //exec.execute(this);


   } 
       
     public void run()
   {
       matrix.PC=(continueFrom==0)?engine.Hex2Dec(engine.HexAutoCorrect4digit(jTextFieldBeginFrom)):continueFrom;
       if(speed[1]!=1){
       //jProgressBar1.setVisible(true);       
       while((!stop)&&matrix.PC<matrix.stopAddress&&(!pause))
       {
               try{
                   matrix.functionRun(matrix.memory[matrix.PC]);
                   //jProgressBar1.setIndeterminate(true);
                   
               for(int row=0;row<jTableAssembler.length;row++){
                  if(jTableAssembler[row][0]!=null)
                   if(engine.convertToNum(jTableAssembler[row][1].toString())==matrix.PC)
                   if(jTableAssembler[row][0].toString().equalsIgnoreCase("#")) {
                              set();
                             /* jButtonStep.setVisible(false);
                              jButtonRun.setVisible(false);
                              jButtonForward.setVisible(true);
                              jButtonBackward.setVisible(true);
                              
                              jButtonStop.setVisible(true);
                              jLabelErrorHang.setVisible(false);
                              jButtonContinue.setVisible(true);*/
                             jButtonStop="Stop";
                              continueFrom=matrix.PC;
                              pause = true;
                              //jTableAssembler.setRowSelectionAllowed(true);
                              //jTableAssembler.changeSelection(row,0, false, false);
                              }
               }
                       if(speed[2]==1){
                           setResister();
                            if(matrix.clockCycleCounter%10000==0){set();}

                       }
               }
               catch(StringIndexOutOfBoundsException e)
                {
                   jButtonStop();
                   //jLabelErrorHang.setText("You have exceeded the memory range");
                   //jLabelErrorHang.setVisible(true);
               }

       }}
       else{
                    if(continueFrom==0)jButtonStop="Pause";
                  //jButtonContinue.setVisible(true);
                  while((!stop)&&matrix.PC<matrix.stopAddress&&(!pause))
                  {
                      try {
               for(int row=0;row<jTableAssembler.length;row++){
                  if(jTableAssembler[row][0]!=null)
                   if(engine.convertToNum(jTableAssembler[row][1].toString())==matrix.PC)
                   if(jTableAssembler[row][0].toString().equalsIgnoreCase("#")) {
                             /* jButtonStep.setVisible(false);
                              jButtonRun.setVisible(false);
                              jButtonForward.setVisible(true);
                              jButtonBackward.setVisible(true);
                              jButtonStop.setVisible(true);
                              
                              jLabelErrorHang.setVisible(false);
                              jButtonContinue.setVisible(true);*/
                             jButtonStop="Stop";
                              continueFrom=matrix.PC;
                              //jTableAssembler.setRowSelectionAllowed(true);
                              //jTableAssembler.changeSelection(row,0, false, false);
                              pause = true;
                              }
                            jButtonForwardActionPerformed();
                            Thread.sleep((long) (speed[0] * 1000));
                        }
                      } catch (Exception e) {
                      }
                  }

       }
       if(!pause){
           jButtonStop="Stop";
           jButtonStop();
       }
       //jProgressBar1.setIndeterminate(false);
       //jProgressBar1.setVisible(false);
       set();
       
       System.err.println("run complete___--");
   }
     
     
     private void jButtonForwardActionPerformed() {                                               

       //jButtonBackward.setEnabled(true);
       if(matrix.stopAddress<matrix.PC||matrix.beginAddress>matrix.PC){
                        jButtonStop();
                       // jLabelErrorHang.setText("You have exceeded the memory range");
                        //jLabelErrorHang.setVisible(true);
      }
      //int select=matrix.PC-matrix.beginAddress;
      matrix.createCopy(matrix);
     oIndex++;
     try{
         loop:
           for(matrix.select = 0; matrix.select < 1000 ; matrix.select++)
           { 
            if(jTableAssembler[matrix.select] [3]!=null)
              if(matrix.PC==engine.Hex2Dec(jTableAssembler[matrix.select][1].toString()) && matrix.select<1000)  
              {    //jTableAssembler.setRowSelectionAllowed(true);
                   //jTableAssembler.changeSelection(matrix.select, matrix.select, false, false);
                  /* jLabelError.setForeground(Color.BLUE);
                   jLabelError.setVisible(true);
                   jLabelError.setText("<html>"+comments[matrix.select]+"</html>");
                   jLabelComment.setVisible(true);
                   jLabelComment.setText("<html>"+matrix.comment(engine.Hex2Dec(jTableAssembler.getValueAt(matrix.select, 4).toString()))+"</html>");*/
                   matrix.select=matrix.select+Integer.parseInt(jTableAssembler[matrix.select][5].toString().trim());
                   break loop;
              }
           }
       }catch(Exception e){
           System.out.println(e);
       }
     if(stop)
     {
         jButtonStop();
     }
     matrix.functionRun(matrix.memory[matrix.PC]);
     set();      
   } 
     
     
      private void jButtonStop() {                                            
     if(stop || jButtonStop.equalsIgnoreCase("Stop"))
     {
       matrix.select = 0;
       /*jButtonForward.setVisible(false);
       jButtonBackward.setVisible(false);
       jButtonStop.setVisible(false);
       jButtonRun.setVisible(true);
       jButtonStep.setVisible(true);
       jButtonContinue.setVisible(false);
       jScrollPane12.setVisible(false);
       jScrollPane12.setVisible(true);
       jTabbedPaneAssemblerEditor.setVisible(false);
       jTabbedPaneAssemblerEditor.setVisible(true);*/
       continueFrom=0;
       stop=true;
       pause=false;
       //File f=new File("cache");
       //deleteDir(f);
     }
     if(jButtonStop.equalsIgnoreCase("Pause"))
     {
         pause = true;
         /*jButtonForward.setVisible(true);
         jButtonBackward.setVisible(true);
         jButtonStop.setVisible(true);
         jButtonContinue.setVisible(true);
         jButtonRun.setVisible(false);
         jButtonStep.setVisible(false);
         jScrollPane12.setVisible(false);
         jScrollPane12.setVisible(true);*/
         jButtonStop="Stop";
     }

   }        
    
     
     
    
  //____________________________________________________________________________________________________________________  
   
   
   
    
  //_______________________________________________________________________________________________________________________ 
    public String[][] jTable8255=new String[8][4];
    public String[][] jTableAssembler=new String[1000][8];
    
     public String[][] jTableMemory=new String[4096][17];
     public String[][] jsTableMemory=new String[65535][2];
    
   public String[][] jTableNoConverter=new String[1][3];
   
    public String[][] jTableCounter=new String[6][2];
    
    
    public String[][] jTableFlagregister=new String[1][10];
    public String[][] jTableInterrupt=new String[1][8];
    public String[][] jTablePort=new String[16][17];
    public String[][] jTableRIM=new String[1][8];
    public String[][] jTableRegister=new String[8][10];
    public String[][] jTableSIM=new String[1][8];
     
     
    
    
     public String jTextArea8255;
    public String jTextAreaAssemblyLanguageEditor;
    public String jTextAreaDisassembler;
    private String jTextAreaLabel;
    public String jTextFieldBeginFrom;
    private String jTextFieldMemBegin=" 0000";
    private String jTextFieldMemStop="FFFF"; 
    
    
    
    
    
    public static void main(String[] ar){
        new Assembler();
    }
    
}
