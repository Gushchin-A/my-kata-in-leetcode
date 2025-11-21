class ParkingSystem {
    private final int TYPE_BIG = 1;
    private final int TYPE_MEDIUM = 2;
    private final int TYPE_SMALL = 3;
    
    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small; 
    }
    
    public boolean addCar(int carType) {
        return minusSpace(carType) > 0;
    }

    private int minusSpace(int carType) throws IllegalArgumentException {
        return switch (carType) {
            case TYPE_BIG -> {
                int current = this.big;
                this.big -= 1;
                yield current;
            }
            case TYPE_MEDIUM -> {
                int current = this.medium;
                this.medium -= 1;
                yield current;
            }
            case TYPE_SMALL -> {
                int current = this.small;
                this.small -= 1;
                yield current;
            }
            default -> throw new IllegalArgumentException("Incorrect car type");
        };
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */