package ir.hosein009.activitytransition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // hello
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().getDecorView().setBackgroundColor(Color.BLUE);
        getSupportActionBar().setTitle("Hosein");
    }

    public void startActivity(View v){
        startActivity(new Intent(MainActivity.this,SecondActivity.class));
    }
    
    //updated by ali on 1/1/2021
    public void add(){
        
    }

    //updated by hosein maleki on 1/1/2021
    public void sum(int a , int b){

    }

    //updated by hosein maleki on 1/1/2021
    public void example2(){

    }
    
    //update by remote
    public void example3(){
    }



    //update by hosein maleki2
    public void example4(){

    }



    //update by hosein maleki2
    public void example5(){

    }
}
