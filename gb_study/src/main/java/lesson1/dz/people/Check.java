package lesson1.dz.people;

public enum Check {

    Run{
        private int complexity;

        @Override
        public void setComplexity(int complexity) {
            this.complexity = complexity;
        }
        @Override
        public int getComplexity() {
            return complexity;
        }
    },
    Jump{
        private int complexity;

        @Override
        public void setComplexity(int complexity) {
            this.complexity = complexity;
        }
        @Override
        public int getComplexity() {
            return complexity;
        }
    },
    Swim{
        private int complexity;

        @Override
        public void setComplexity(int complexity) {
            this.complexity = complexity;
        }
        @Override
        public int getComplexity() {
            return complexity;
        }
    };

    public abstract void setComplexity(int complexity);
    public abstract int getComplexity();


    public static void setAllValue (int complexityRun, int complexityJump, int complexitySwim){
        Run.setComplexity(complexityRun);
        Jump.setComplexity(complexityJump);
        Swim.setComplexity(complexitySwim);
    }
}
