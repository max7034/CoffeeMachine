public class Main {
    public static void main(String[] args) {
        int moneyAmount = 18;

        int cappucinoPrice = 180;
        int lattePrice = 120;
        int espressoPrice = 80;
        int waterPrice = 20;

        boolean isMilkEnough = false;
        boolean canBuyAnything = false;
        boolean moneyEnoughForCappucino = moneyAmount >= cappucinoPrice;

        if(moneyEnoughForCappucino && isMilkEnough)
        {
            System.out.println("�� ������ ������ ��������"); //r
            canBuyAnything = true;
        }

        if(moneyAmount >= lattePrice && isMilkEnough)
        {
            System.out.println("�� ������ ������ �����");
            canBuyAnything = true;
        }

        if(moneyAmount >= espressoPrice)
        {
            System.out.println("�� ������ ������ ��������");
            canBuyAnything = true;
        }

        if(moneyAmount >= waterPrice)
        {
            System.out.println("�� ������ ������ ����");
            canBuyAnything = true;
        }

        if (!canBuyAnything)
        {
            System.out.println("������������ �������!");
        }

        System.out.println(canBuyAnything ? "�������� �������" : "������������ �������!");
    }
}
