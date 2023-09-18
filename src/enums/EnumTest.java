package enums;

public class EnumTest {
    enum TR {
        BUS(100) {
            int fare(int distance) {
                return distance * price;
            }
        },
        TRAIN(150) {
            int fare(int distance) {
                return distance * price;
            }
        },
        SHIP(100) {
            int fare(int distance) {
                return distance * price;
            }
        },
        AIRPLANE(300) {
            int fare(int distance) {
                return distance * price;
            }
        };

        TR(int price) {
            this.price = price;
        }

        protected final int price;

        abstract int fare(int distance);
    }

}
