class Solution {
    public double[] convertTemperature(double celsius) {
        double arr[] = new double[2];

        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80  + 32.00;


        for(int i = 1 ; i<arr.length ; i++){
         arr[i - 1] = kelvin;
         arr[i] = fahrenheit;
            
            
        }
        return arr;
        
        
    }
}