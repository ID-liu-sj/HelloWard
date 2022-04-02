package day0323;

public class ReplaceAllDemo {
    public static void main(String[] args) {
        String line = "abc123def456ghi789";
        line = line.replaceAll("[0-9]", "*");
        System.out.println(line);

        line = line.replaceAll("\\*+","#we#");
        System.out.println(line);


    }
}
