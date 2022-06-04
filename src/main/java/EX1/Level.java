package EX1;

public enum Level {

        ERROR ( "ERROR"), WARNING ( "WARNING"), INFO ( "INFO"), DEBUG ( "DEBUG");

        private String levelValue;
        private Level(String message) {

            this.levelValue = message;
        }

        public String getLevelValue() {

            return this.levelValue;
        }

        @Override
        public String toString(){
            return levelValue;
        }
}
