package DescriptiveStatistics;

/**
 * @author Lucas Vieira
 */
public class DescriptiveNumber {
    Double number;
    int frequency;

    public DescriptiveNumber(Double number, int frequency) {
        this.number = number;
        this.frequency = frequency;
    }
    
    public DescriptiveNumber(){
        
    }

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
    
    
}
