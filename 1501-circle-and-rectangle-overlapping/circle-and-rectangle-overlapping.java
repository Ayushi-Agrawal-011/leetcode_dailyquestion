class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
 int       newX = Math.max(x1, Math.min(xCenter, x2));
int newY = Math.max(y1, Math.min(yCenter, y2));
int dist=(newX-xCenter)*(newX-xCenter)+(newY-yCenter)*(newY-yCenter);
return dist<=radius*radius;
    }
}