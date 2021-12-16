package tasks.task22;

public class AbstractFactory {
        public Chair getName(String chairInfo){
            Chair chair = null;
            if (chairInfo=="Victorian") {
                chair = new VictorianChair();
            } else if (chairInfo == "Multifunctional") {
                chair = new MultifunctionalChair();
            } else if (chairInfo=="Magic") {
                chair = new MagicChair();
            }
            return chair;
        }
    }
    class VictorianChair implements Chair{
        private String name ="Victorian";

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
    class MultifunctionalChair implements Chair{
        private String name ="Multifunctional";

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
    class MagicChair implements Chair{
        private String name ="Magic";

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
