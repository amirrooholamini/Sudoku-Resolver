package i3center.com.android.rooholamini.sodokusolver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.Struct;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static TextView[][] txts;
    public static ArrayList<StructCell> structs;
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnResolve = (Button)findViewById(R.id.btnResolve);
        handler = new Handler();
        structs = new ArrayList<>();
        btnResolve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkFixedValues();
                run();
            }
        });

        fillTexts();
        fillStructs();


    }

    private void fillTexts(){
        txts = new TextView[9][9];
        txts[0][0] = (TextView)findViewById(R.id.txt1);
        txts[0][1] = (TextView)findViewById(R.id.txt2);
        txts[0][2] = (TextView)findViewById(R.id.txt3);
        txts[0][3] = (TextView)findViewById(R.id.txt4);
        txts[0][4] = (TextView)findViewById(R.id.txt5);
        txts[0][5] = (TextView)findViewById(R.id.txt6);
        txts[0][6] = (TextView)findViewById(R.id.txt7);
        txts[0][7] = (TextView)findViewById(R.id.txt8);
        txts[0][8] = (TextView)findViewById(R.id.txt9);
        txts[1][0] =(TextView)findViewById(R.id.txt10);
        txts[1][1] =(TextView)findViewById(R.id.txt11);
        txts[1][2] =(TextView)findViewById(R.id.txt12);
        txts[1][3] =(TextView)findViewById(R.id.txt13);
        txts[1][4] =(TextView)findViewById(R.id.txt14);
        txts[1][5] =(TextView)findViewById(R.id.txt15);
        txts[1][6] =(TextView)findViewById(R.id.txt16);
        txts[1][7] =(TextView)findViewById(R.id.txt17);
        txts[1][8] =(TextView)findViewById(R.id.txt18);
        txts[2][0] =(TextView)findViewById(R.id.txt19);
        txts[2][1] =(TextView)findViewById(R.id.txt20);
        txts[2][2] =(TextView)findViewById(R.id.txt21);
        txts[2][3] =(TextView)findViewById(R.id.txt22);
        txts[2][4] =(TextView)findViewById(R.id.txt23);
        txts[2][5] =(TextView)findViewById(R.id.txt24);
        txts[2][6] =(TextView)findViewById(R.id.txt25);
        txts[2][7] =(TextView)findViewById(R.id.txt26);
        txts[2][8] =(TextView)findViewById(R.id.txt27);
        txts[3][0] =(TextView)findViewById(R.id.txt28);
        txts[3][1] =(TextView)findViewById(R.id.txt29);
        txts[3][2] =(TextView)findViewById(R.id.txt30);
        txts[3][3] =(TextView)findViewById(R.id.txt31);
        txts[3][4] =(TextView)findViewById(R.id.txt32);
        txts[3][5] =(TextView)findViewById(R.id.txt33);
        txts[3][6] =(TextView)findViewById(R.id.txt34);
        txts[3][7] =(TextView)findViewById(R.id.txt35);
        txts[3][8] =(TextView)findViewById(R.id.txt36);
        txts[4][0] =(TextView)findViewById(R.id.txt37);
        txts[4][1] =(TextView)findViewById(R.id.txt38);
        txts[4][2] =(TextView)findViewById(R.id.txt39);
        txts[4][3] =(TextView)findViewById(R.id.txt40);
        txts[4][4] =(TextView)findViewById(R.id.txt41);
        txts[4][5] =(TextView)findViewById(R.id.txt42);
        txts[4][6] =(TextView)findViewById(R.id.txt43);
        txts[4][7] =(TextView)findViewById(R.id.txt44);
        txts[4][8] =(TextView)findViewById(R.id.txt45);
        txts[5][0] =(TextView)findViewById(R.id.txt46);
        txts[5][1] =(TextView)findViewById(R.id.txt47);
        txts[5][2] =(TextView)findViewById(R.id.txt48);
        txts[5][3] =(TextView)findViewById(R.id.txt49);
        txts[5][4] =(TextView)findViewById(R.id.txt50);
        txts[5][5] =(TextView)findViewById(R.id.txt51);
        txts[5][6] =(TextView)findViewById(R.id.txt52);
        txts[5][7] =(TextView)findViewById(R.id.txt53);
        txts[5][8] =(TextView)findViewById(R.id.txt54);
        txts[6][0] =(TextView)findViewById(R.id.txt55);
        txts[6][1] =(TextView)findViewById(R.id.txt56);
        txts[6][2] =(TextView)findViewById(R.id.txt57);
        txts[6][3] =(TextView)findViewById(R.id.txt58);
        txts[6][4] =(TextView)findViewById(R.id.txt59);
        txts[6][5] =(TextView)findViewById(R.id.txt60);
        txts[6][6] =(TextView)findViewById(R.id.txt61);
        txts[6][7] =(TextView)findViewById(R.id.txt62);
        txts[6][8] =(TextView)findViewById(R.id.txt63);
        txts[7][0] =(TextView)findViewById(R.id.txt64);
        txts[7][1] =(TextView)findViewById(R.id.txt65);
        txts[7][2] =(TextView)findViewById(R.id.txt66);
        txts[7][3] =(TextView)findViewById(R.id.txt67);
        txts[7][4] =(TextView)findViewById(R.id.txt68);
        txts[7][5] =(TextView)findViewById(R.id.txt69);
        txts[7][6] =(TextView)findViewById(R.id.txt70);
        txts[7][7] =(TextView)findViewById(R.id.txt71);
        txts[7][8] =(TextView)findViewById(R.id.txt72);
        txts[8][0] =(TextView)findViewById(R.id.txt73);
        txts[8][1] =(TextView)findViewById(R.id.txt74);
        txts[8][2] =(TextView)findViewById(R.id.txt75);
        txts[8][3] =(TextView)findViewById(R.id.txt76);
        txts[8][4] =(TextView)findViewById(R.id.txt77);
        txts[8][5] =(TextView)findViewById(R.id.txt78);
        txts[8][6] =(TextView)findViewById(R.id.txt79);
        txts[8][7] =(TextView)findViewById(R.id.txt80);
        txts[8][8] =(TextView)findViewById(R.id.txt81);
    }
    private void fillStructs(){
        for (int i=0;i<9;i++) {
            for (int j=0;j<9;j++) {
                StructCell struct = new StructCell();
                struct.txt = txts[i][j];
                struct.impossibleValues = new ArrayList<>();
                struct.possibleValues = new ArrayList<>();
                struct.possibleValues.add(1);
                struct.possibleValues.add(2);
                struct.possibleValues.add(3);
                struct.possibleValues.add(4);
                struct.possibleValues.add(5);
                struct.possibleValues.add(6);
                struct.possibleValues.add(7);
                struct.possibleValues.add(8);
                struct.possibleValues.add(9);
                struct.fixValue = false;
                struct.selectedValue = -1;
                structs.add(struct);
            }

        }
    }
    private void checkFixedValues(){
        for (int i=0; i<structs.size();i++){
            TextView txt = structs.get(i).txt;
            if(txt.getText().toString().length()>0){
                structs.get(i).fixValue = true;
                int value = Integer.valueOf(structs.get(i).txt.getText().toString());
                structs.get(i).selectedValue = value;
                removeFromNeighbors(i);
            }
        }

    }
    private void removeFromNeighbors(int cellIdx){
        int i = cellIdx/9;
        int j = cellIdx%9;
        for(int idx = 0 ; idx<structs.size();idx++) {
            StructCell cell = structs.get(idx);
            int r = idx/9;
            int c = idx%9;
            if(r==i && c==j){
                continue;
            }
            if(cell.txt.getText().toString().length()==0){
                if(i == r || j == c || ((int)i/3 == (int)r/3 && (int)j/3 == (int)c/3)){
                    cell.possibleValues = removeFromArray(cell.possibleValues,structs.get(cellIdx).selectedValue);
                }
            }
        }
    }

    private ArrayList<Integer> removeFromArray(ArrayList<Integer> array , int value){
        ArrayList<Integer> newArray = new ArrayList<>();
        for(int i=0;i<array.size();i++){
            if(array.get(i)!=value){
                newArray.add(array.get(i));
            }
        }
        return newArray;
    }

    private void run(){
        final int s = structs.size();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (!hasSolved()){

                        int lastIdx = 80;
                        int idx = 80;
                        for(int i = 0 ; i < s ; i++){
                            StructCell struct = structs.get(i);
                            if(struct.fixValue){
                                continue;
                            }
                            if(struct.txt.getText().toString().length() == 0){
                                idx = i;
                                break;
                            }else{
                                lastIdx = i;
                            }
                        }
                        final StructCell cell = structs.get(idx);
                        final StructCell lastCell = structs.get(Math.max(0,lastIdx));

                        // ========================================

                        if(cell.possibleValues.size() == 0){
//                            cell.possibleValues.add(1);
//                            cell.possibleValues.add(2);
//                            cell.possibleValues.add(3);
//                            cell.possibleValues.add(4);
//                            cell.possibleValues.add(5);
//                            cell.possibleValues.add(6);
//                            cell.possibleValues.add(7);
//                            cell.possibleValues.add(8);
//                            cell.possibleValues.add(9);
//                            addToNeighbors(cell.selectedValue);
//                            cell.selectedValue = -1;
//                            cell.txt.setText("");
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    lastCell.txt.setText("");
                                }
                            });
                           // addToNeighbors(lastIdx);
                        }else{
                            cell.selectedValue = cell.possibleValues.get(0);
                            cell.possibleValues.remove(0);
                            removeFromNeighbors(idx);

                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    cell.txt.setText(cell.selectedValue+"");
                                }
                            });

                        }

                        // ========================================
                        Log.i("LOGGG",structs.get(10).possibleValues+"");
                        Thread.sleep(300);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();


    }

    private boolean hasSolved(){
        int s = structs.size();
        for(int i=0;i<s;i++){
            if(structs.get(i).txt.getText().toString().length()==0){
                return false;
            }
        }
        for(int i1 = 0 ; i1<9 ; i1++){
            for (int j1 = 0 ; j1<9 ; j1++){
                int val1 = Integer.valueOf(txts[i1][j1].getText().toString());
                for(int i2 = 0 ; i2<9 ; i2++){
                    for (int j2 = 0 ; j2<9 ; j2++){
                        int val2 = Integer.valueOf(txts[i2][j2].getText().toString());
                        if(i1 == i2 && j1 == j2){
                            continue;
                        }
                        if(i1 == i2 || j1 == j2 || ((int)i1/3 == (int)i2/3 && (int)j1/3 == (int)j2/3)){
                            if(val1 == val2){
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}