import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {  
    // set variables
    float flowerX = random(0, width);
    float flowerY = random(0, height);
    float flowerDiameter = random(10, 200);
    float stemX = random(0, 200);
    float stemWidth = random(10, 80);
    float stemHeight = random(10, 250);
    float skyX = width;
    float skyY = 250;

	  /** Use large rectangle to create the sky, make the rectangle blue */ 
    fill(105, 245, 231);
    rect(0, 0, skyX, skyY);

    /** Create thin vertical rectangle as the flower stem, make it dark green */    
    fill(0, 115, 25);
    rect(stemX, flowerY, stemWidth, stemHeight);
  
    /** Create circles for the flower petals */  
    fill(250, 238, 2);
    ellipse(flowerX - 40, flowerY - 40, flowerDiameter + 10, flowerDiameter + 10);
    ellipse(flowerX + 40, flowerY - 40, flowerDiameter + 10, flowerDiameter + 10);
    ellipse(flowerX - 40, flowerY + 40, flowerDiameter + 10, flowerDiameter + 10);
    ellipse(flowerX + 40, flowerY + 40, flowerDiameter + 10, flowerDiameter + 10);

    /** Create circle to represent the center of the flower */
    fill(20, 23, 20);
    ellipse(flowerX, flowerY, flowerDiameter, flowerDiameter);

    // If statements
    if(flowerX > 100 && flowerX <300){
      background(255, 132, 0);
    if(flowerX < 100 || flowerDiameter > 300);{
    background(123,31, 184);  
    }
      
      
    }

  }
}