
import java.awt.*;

public class Main {

    public static final int COLOR_YELLOW = new Color(250,201,20).getRGB();
    public static final int COLOR_BLUE = new Color(17,13,99).getRGB();
    public static final int COLOR_RED = new Color(196,0,15).getRGB();
    public static final int COLOR_BLACK = new Color(5,5,5).getRGB();
    public static final int COLOR_WHITE = new Color(255,255,255).getRGB();
    public static final int COLOR_GREEN = new Color(35,138,51).getRGB();


    
    public static int[][] createCOLFlag (int heigth, int width) {
        int [][] flag = new int[heigth][width];

        int rowIn = 0;
        int rowend =0;

        rowend = (int)(heigth*0.50);
        for (int row = rowIn; row<rowend; row++) {
            for (int cell =0; cell<flag[row].length; cell ++) {
                flag[row][cell] = COLOR_YELLOW;
            }
        }
        rowend = (int)(heigth*0.75);
        for (int row = (int)(heigth*0.5); row<rowend; row++) {
            for (int cell =0; cell<flag[row].length; cell ++) {
                flag[row][cell] = COLOR_BLUE;
            }
        }
        rowend = (int)(heigth*1);
        for (int row = (int)(heigth*0.75); row<rowend; row++) {
            for (int cell =0; cell<flag[row].length; cell ++) {
                flag[row][cell] = COLOR_RED;
            }
        }

    return flag;
    }
    public static int[][] createVENFlag (int heigth, int width) {
        int [][] flag = new int[heigth][width];
        int rowend =0;

        rowend = (int)(heigth*0.4);
        for (int row = 0; row<rowend; row++) {
            for (int cell =0; cell<flag[row].length; cell ++) {
                flag[row][cell] = COLOR_YELLOW;
            }
        }
        rowend = (int)(heigth*0.7);
        for (int row = (int)(heigth*0.4); row<rowend; row++) {
            for (int cell =0; cell<flag[row].length; cell ++) {
                flag[row][cell] = COLOR_BLUE;
            }
        }
        rowend = (int)(heigth*1);
        for (int row = (int)(heigth*0.7); row<rowend; row++) {
            for (int cell =0; cell<flag[row].length; cell ++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        return flag;
    }
    public static int[][] createPOLFlag (int heigth, int width) {
        int [][] flag = new int[heigth][width];
        int rowend =0;

        rowend = (int)(heigth*0.5);
        for (int row = 0; row<rowend; row++) {
            for (int cell =0; cell<flag[row].length; cell ++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }
        rowend = (int)(heigth*1);
        for (int row = (int)(heigth*0.5); row<rowend; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        return flag;
    }
    public static int[][] createPANFlag (int heigth, int width) {
        int [][] flag = new int[heigth][width];
        int rowend =0;
        int cellend = 0;

        cellend = (int)(width*0.5);
        rowend = (int)(heigth*0.5);
        for (int row = 0; row<rowend; row++) {
            for (int cell =0; cell<cellend; cell ++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }

        cellend = (int)(width);
        rowend = (int)(heigth*0.5);
        for (int row = 0; row<rowend; row++) {
            for (int cell = (int)(width*0.5); cell<cellend; cell ++) {
                flag[row][cell] = COLOR_RED;
            }
        }
        cellend = (int)(width*0.5);
        rowend = (int)(heigth);
        for (int row = (int)(heigth*0.5); row<rowend; row++) {
            for (int cell = 0; cell<cellend; cell ++) {
                flag[row][cell] = COLOR_BLUE;
            }
        }
        cellend = (int)(width);
        rowend = (int)(heigth);
        for (int row = (int)(heigth*0.5); row<rowend; row++) {
            for (int cell = (int)(width*0.5); cell<cellend; cell ++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }
        return flag;
    }
    public static int[][] createCHLFlag (int heigth, int width) {
        int [][] flag = new int[heigth][width];
        int rowend =0;
        int cellend = 0;

        rowend = (int)(heigth*0.50);
        cellend = (int)(width*0.3);
        for (int row = 0; row<rowend; row++) {
            for (int cell =0; cell<cellend; cell ++) {
                flag[row][cell] = COLOR_BLUE;
            }
        }
        rowend = (int)(heigth*0.5);
        cellend = (int)(width);
        for (int row = 0; row<rowend; row++) {
            for (int cell =(int)(width*0.3); cell<cellend; cell ++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }
        rowend = (int)(heigth);
        cellend = (int)(width);
        for (int row = (int)(heigth*0.5); row<rowend; row++) {
            for (int cell =0; cell<cellend; cell ++) {
                flag[row][cell] = COLOR_RED;
            }
        }
        return flag;
    }
    public static int[][] createUSAFlag (int heigth, int width) {
        int [][] flag = new int[heigth][width];
        int rowend =0;
        int cellend = 0;

        rowend = (int)(heigth*0.50);
        cellend = (int)(width*0.35);
        for (int row = 0; row<rowend; row++) {
            for (int cell =0; cell<cellend; cell ++) {
                flag[row][cell] = COLOR_BLUE;
            }
        }

        rowend = (int)(heigth*0.50);
        cellend = (int)(width);
        for (int row = 0; row<rowend; row++) {
            for (int cell = (int)(width*0.35); cell<cellend; cell ++) {

                if (row%2 == 0) {
                    flag[row][cell] = COLOR_RED;
                } 
                else {
                    flag[row][cell] = COLOR_WHITE;
                }
            

            }
        }
        rowend = (int)(heigth);
        cellend = (int)(width);
        for (int row = (int)(heigth*0.5); row<rowend; row++) {
            for (int cell = 0; cell<cellend; cell ++) {

                if (row%2 == 0) {
                    flag[row][cell] = COLOR_RED;
                }
                else {
                    flag[row][cell] = COLOR_WHITE;
                }

            }
        }
        return flag;
    }
    
    public static int[][] createCZEFlag (int heigth, int width) {
        int [][] flag = new int[heigth][width];
        int rowend =0;
        int cellend = 0;
        int rowIn = 0;
        int x = 1;

        rowend = (int)(heigth*0.5);
        cellend = (int)(width) ;
        
        for (int row = rowIn; row<rowend; row++) {
            for (int cell =0; cell<x; cell ++) {
                flag[row][cell] = COLOR_BLUE;

            }
            x++;
        }
        
        x = (int)(heigth*0.5);
        rowend = (int)(heigth);
        for (int row = (int)(heigth*0.5); row<rowend; row++) {
            for (int cell =x-1; cell>-1; cell--) {
                flag[row][cell] = COLOR_BLUE;

            }
            x--;
        }
        x = 1;
        rowend = (int)(heigth*0.5);
        for (int row = 0; row<rowend; row++) {
            for (int cell =x; cell<cellend; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
            x++;
        }
        x= (int)(heigth*0.5);
        rowIn = (int)(heigth*0.5);
        rowend = (int)(heigth);
        for (int row = rowIn; row<rowend; row++) {
            for (int cell =x; cell<cellend; cell++) {
                flag[row][cell] = COLOR_RED;
            }
            x--;
        }
        return flag;
    }
    
    public static int[][] createDNKFlag (int heigth, int width) {
         int[][] flag= new int[heigth][width];
        int rowIn = 0;
        int rowEnd = 0;
        rowEnd = (int)(heigth*0.40);
        for(int row=rowIn;row< rowEnd;row++){
            for(int cell = 0; cell<flag[row].length;cell++) {
                if(cell >= flag[row].length*0.25 && cell<=flag[row].length*0.35){
                    flag[row][cell]=COLOR_WHITE;
                }
                else {
                    flag[row][cell] = COLOR_RED;
                }
            }
        }
        rowIn = (int)(heigth*0.40);
        rowEnd = (int)(heigth*0.60);
        for(int row=rowIn;row< rowEnd;row++){
            for(int cell=0;cell<flag[row].length;cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }
        rowIn = (int)(heigth*0.60);
        for(int row=rowIn;row< flag.length;row++){
            for(int cell=0;cell<flag[row].length;cell++) {
                if(cell>=flag[row].length*0.25&&cell<=flag[row].length*0.35){
                    flag[row][cell]=COLOR_WHITE;
                }
                else {
                    flag[row][cell] = COLOR_RED;
                }
            }
        }
        return flag;
    }
        
        public static int[][] createFINFlag (int heigth, int width) {
            int[][] flag= new int[heigth][width];
            int rowIn=0;
            int rowEnd=0;

            rowEnd=(int)(heigth*0.3333)+1;
            for(int row=rowIn; row<rowEnd;row++){
                for(int cell=0; cell<flag[row].length;cell++) {
                    if(cell>=flag[row].length*0.20&&cell<=flag[row].length*0.40){
                        flag[row][cell]=COLOR_BLUE;
                    }
                    else {
                        flag[row][cell] = COLOR_WHITE;
                    }
                }
            }
            rowIn =(int)(heigth*0.3333)+1;
            rowEnd=(int)(heigth*0.6666)+1;
            for(int row=rowIn;row< rowEnd;row++){
                for(int cell=0;cell<flag[row].length;cell++) {
                    flag[row][cell] = COLOR_BLUE;
                }
            }
            rowIn=(int)(heigth*0.6666)+1;
            for(int row = rowIn;row< flag.length;row++){
                for(int cell = 0;cell<flag[row].length;cell++) {
                    if(cell >= flag[row].length*0.20&&cell<=flag[row].length*0.40){
                        flag[row][cell]=COLOR_BLUE;
                    }
                    else {
                        flag[row][cell] = COLOR_WHITE;
                    }
                }
            }
            return flag;
        }
    

        public static int[][] createNORFlag (int heigth, int width) {
            int[][] flag= new int[heigth][width];
            int rowIn = 0;
            int rowEnd = 0;

            rowEnd=(int)(heigth*0.3333)+1;
            for(int row=rowIn;row< rowEnd;row++){
                for(int cell = 0;cell<flag[row].length;cell++) {
                    if(cell>=flag[row].length*0.20&&cell<=flag[row].length*0.40){
                        if(cell<flag[row].length*0.25||cell>flag[row].length*0.35){
                            flag[row][cell]=COLOR_WHITE;
                        }
                        else {
                            flag[row][cell] = COLOR_BLUE;
                        }
                    }
                    else {
                        flag[row][cell] = COLOR_RED;
                    }
                }
            }
            rowIn=(int)(heigth*0.3333)+1;
            rowEnd=(int)(heigth*0.6666)+1;
            for(int row=rowIn;row< rowEnd;row++){
                for(int cell=0;cell<flag[row].length;cell++) {
                    if((row<=flag.length*0.416633||row>=flag.length*0.583267)&&(cell<flag[row].length*0.25||cell>flag[row].length*0.35)){
                        flag[row][cell]=COLOR_WHITE;
    
                    }
                    else {
                        flag[row][cell] = COLOR_BLUE;
                    }
                }
            }
            rowIn =(int)(heigth*0.6666)+1;
            for(int row=rowIn;row< flag.length;row++){
                for(int cell=0;cell<flag[row].length;cell++) {
                    if(cell>=flag[row].length*0.20&&cell<=flag[row].length*0.40){
                        if(cell<flag[row].length*0.25||cell>flag[row].length*0.35){
                            flag[row][cell]=COLOR_WHITE;
                        }
                        else {
                            flag[row][cell] = COLOR_BLUE;
                        }
                    }
                    else {
                        flag[row][cell] = COLOR_RED;
                    }
                }
            }
            return flag;
        }
    
    
    public static int[][] createKWTFlag (int heigth, int width) {
        int [][]flag=new int[heigth][width];
        int rowIn=0;
        int rowEnd=0;
        int x=1;
        int y=1;
        rowEnd=(int)(heigth*0.50);
        for(int i=rowIn;i< rowEnd;i++){
            for(int j=0;j<x;j++){
                if(j>flag[i].length*0.20){
                    flag[i][j]=COLOR_WHITE;
                }
                else {
                    flag[i][j] = COLOR_BLACK;
                }
            }
            for(int j=y;j<flag[i].length;j++){
                if(i>flag.length*0.3333){
                    flag[i][j]=COLOR_WHITE;
                }
                else {
                    flag[i][j] = COLOR_GREEN;
                }
            }
            y++;
            x++;
        }
        x--;
        y--;
        rowIn=(int)(heigth*0.50);
        for(int i=rowIn;i< flag.length;i++){
            for(int j=0;j<x;j++){
                if(j>flag[i].length*0.20){
                    flag[i][j]=COLOR_WHITE;
                }
                else {
                    flag[i][j] = COLOR_BLACK;
                }
            }
            for(int j=y;j<flag[i].length;j++){
                if(i<flag.length*0.6666){
                    flag[i][j]=COLOR_WHITE;
                }
                else {

                        flag[i][j] = COLOR_RED;
                }
            }
            y--;
            x--;
        }

        return flag;
    }

    
         public static int[][] createZAFFlag (int heigth, int width) {
            int [][]flag=new int[heigth][width];
            int rowIn=0;
            int rowEnd=0;
            int B=1;
            int w=1;
            rowEnd=(int)(heigth*0.50);
            for(int f=rowIn;f< rowEnd;f++){
                for(int c=0;c<B;c++){
                    if(f-c>=flag.length*0.166666){
                        if(f-c>(flag.length*0.208333333)&&flag.length<20||f-c>(flag.length*0.208333333)+1&&flag.length>=20){
                            flag[f][c] = COLOR_BLACK;
                        }
                        else {
                            flag[f][c] = COLOR_YELLOW;
                        }
                    }
                    else {
                        flag[f][c] = COLOR_GREEN;
                    }
                }
                for(int c=w;c<flag[f].length;c++){
                    if(f>flag.length*0.3333){
                        if(f>flag.length*0.416633){
                            flag[f][c]=COLOR_GREEN;
                        }
                        else {
                            flag[f][c] = COLOR_WHITE;
                        }
                    }
                    else {
                        if(c==f+1||c==f+2&&flag.length>=20){
                            flag[f][c] = COLOR_WHITE;
                        }
                        else {
                            flag[f][c] = COLOR_RED;
                        }
                    }
                }
                w++;
                B++;
            }
            B--;
            w--;
            rowIn=(int)(heigth*0.50);
            for(int f=rowIn;f< flag.length;f++){
                for(int c=0;c<B;c++){
                    if(f+c<=flag.length*0.75||f+c<=(flag.length*0.75)+1&&flag.length>=20){
                        if(f+c<(flag.length*0.75)||f+c<(flag.length*0.75)&&flag.length>=20){
                            flag[f][c] = COLOR_BLACK;
                        }
                        else {
                            flag[f][c] = COLOR_YELLOW;
                        }
                    }
                    else {
                        flag[f][c] = COLOR_GREEN;
                    }
    
                }
                for(int c=w;c<flag[f].length;c++){
                    if(f<flag.length*0.6666){
                        if(f<flag.length*0.583267){
                            flag[f][c]=COLOR_GREEN;
                        }
                        else {
                            flag[f][c] = COLOR_WHITE;
                        }
                    }
                    else {
                        if(c+f== flag.length||c+f== flag.length+1&&flag.length>=20){
                            flag[f][c] = COLOR_WHITE;
                        }
                        else {
                            flag[f][c] = COLOR_BLUE;
                        }
                    }
                }
                w--;
                B--;
            }
    
            return flag;
        }
    
     public static int[][] createCHEFlag (int heigth, int width) {
        int[][] flag = new int[heigth][width];
        int rowIn = 0;
        int rowEnd = flag.length;
        for (int row = rowIn; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                if(row>0&&row!= rowEnd-1){
                    if(cell>=flag[row].length*0.40&&cell<flag[row].length*0.60||row>flag.length*0.3333&&row< flag.length*0.6666&&cell>=flag[row].length*0.25&&cell<flag[row].length*0.75){
                        flag[row][cell] = COLOR_WHITE;
                    }
                    else{
                        flag[row][cell] = COLOR_RED;
                    }
                }
                else {
                    flag[row][cell] = COLOR_RED;
                }
            }
        }
        return flag;
    }
    public static void main(String[] args) {
    int[][] flag = {};
        
        flag = createCOLFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag = createVENFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag = createPOLFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag = createPANFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag = createCHLFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag = createUSAFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag = createCZEFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag = createDNKFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag = createFINFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag = createNORFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);      
        flag = createKWTFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag = createZAFFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag = createCHEFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
    }
}