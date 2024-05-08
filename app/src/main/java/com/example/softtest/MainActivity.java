package com.example.softtest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

class shape{
       String name;
       shape(String name){
           this.name=name;
       }
       public String showShape(){
           return "The shape is "+name+"\n"+"It's area is "+area()+"\n"+"It's perimeter is "+perimeter()+"\n";
       }
       public float area(){
           return 0;
       }
       public float perimeter(){
           return 0;
       }
   };

   class Square extends shape {
       float side_length;

       Square(float side) {
           super("Square");
           this.side_length = side;
       }

       public float area() {
           return side_length * side_length;
       }

       @Override
       public float perimeter() {
           return 4 * side_length;
       }
   }

   class Circle extends shape{
       public float radius;
       Circle(float radius) {
           super("Circle");
            this.radius=radius;
       }
       @Override
       public float area() {
           return (float) (3.14*radius*radius);
       }
       public float perimeter(){
           return (float) (2*radius*3.14);
       }
   }

class Triangle extends shape{
    public  float side1 , side2 , side3 ;
    public Triangle(float side1 , float side2 , float side3) {
        super("Triangle");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public float area(){
        float s = (side1 + side2 + side3) / 2;
        return (float) Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    public float perimeter(){
        return (side1 + side2 + side3);
    }
}

class color{
       String name;
       public color(String name){
           this.name=name;
       }
       public String showColor(){
           return "The color is "+name;
       }
}


class Red extends color{
    public Red(){
        super("Red");
    }
}

class Green extends color{
    public Green(){
        super("Green");
    }
}

class Blue extends color{
    public Blue(){
        super("Blue");
    }
}


public class MainActivity extends AppCompatActivity {

    public EditText ShapeEditText, ColorEditText ;
    public Button button ;
    public TextView ShapeTextView , ColorTextView ;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShapeEditText=findViewById(R.id.shape);
        ColorEditText=findViewById(R.id.color);
        button=findViewById(R.id.button);
        ShapeTextView=findViewById(R.id.show_shape);
        ColorTextView=findViewById(R.id.show_color);



      button.setOnClickListener(v -> {
          String shape=ShapeEditText.getText().toString();
          String color=ColorEditText.getText().toString();
           if(shape.equals("Circle")){
               Circle c=new Circle(5);
               ShapeTextView.setText(c.showShape());
           }

         else if(shape.equals("Square")){
              Square s=new Square(5);
              ShapeTextView.setText(s.showShape());
          }
         else if(shape.equals("Triangle")){
              Triangle t=new Triangle(3,4,5);
              ShapeTextView.setText(t.showShape());
          }
         else {
             ShapeTextView.setText("Invalid Shape");
           }


          if(color.equals("Red")){
              Red r = new Red();
              ColorTextView.setText(r.showColor());
          }
          else if(color.equals("Green")){
              Green g = new Green();
              ColorTextView.setText(g.showColor());
          }
          else if(color.equals("Blue")){
              Blue b = new Blue();
              ColorTextView.setText(b.showColor());
          }
          else{
              ColorTextView.setText("Invalid Color");
          }

      });

    }
}