public class BmiService {
    public float calculate (float mass, float height) {
        float bmi;
        float heightM = height/100;
        bmi = mass / (heightM*heightM);
        return bmi;
    }
}
