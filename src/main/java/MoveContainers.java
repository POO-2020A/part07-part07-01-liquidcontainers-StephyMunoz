
public class MoveContainers {
    private int firstContainer;
    private int secondContainer;

    public MoveContainers() {
        this.firstContainer = 0;
        this.secondContainer = 0;
    }
    public int addAmount(int amountOfLiquid){
        if(amountOfLiquid < 0){
            return this.firstContainer;
        }
        this.firstContainer = this.firstContainer + amountOfLiquid;
        if(this.firstContainer >= 100){
            return this.firstContainer = 100;
        }
        return this.firstContainer;
    }
    public int moveAmount(int amountOfLiquid){
        if(amountOfLiquid < 0){
            return this.secondContainer;
        }
        
        if(this.firstContainer >= amountOfLiquid){
            
            this.firstContainer = this.firstContainer - amountOfLiquid;
            this.secondContainer = this.secondContainer + amountOfLiquid;
            if(this.secondContainer >= 100){
                return this.secondContainer = 100;
            }
            
        } else {
            this.secondContainer = this.secondContainer + this.firstContainer;
            if(this.secondContainer >= 100){
                return this.secondContainer = 100;
            }
            this.firstContainer = 0;
            
        }
        return this.secondContainer;
    }
    
    public int removeAmount(int amountOfLiquid){
        if(amountOfLiquid < 0){
            return this.secondContainer;
        }
        if(this.secondContainer < amountOfLiquid){
            this.secondContainer = 0;
        }
        this.secondContainer = this.secondContainer - amountOfLiquid;
        if(this.secondContainer < 0){
            return this.secondContainer = 0;
        }
        
        return this.secondContainer;
    }
    @Override
    public String toString(){
        return "First: " + this.firstContainer + "/100" 
                + "\nSecond: " + this.secondContainer + "/100";
    }
    
}
