public class Person implements Comparable<Person>{
    private String name;
    private double literacyPercent;
    private int year;
    private String sex;

    public Person(String s){
        String[] parts = s.split(",");
        String[] p = parts[2].split(" ");
        sex = p[1].trim();
        name = parts[3].trim();
        year = Integer.valueOf(parts[4].trim());
        literacyPercent = Double.valueOf(parts[5].trim());
    }

    public double getLiteracyPercent(){
        return literacyPercent;
    }

    @Override
    public String toString() {
        return name + " (" + year + "), " + sex + ", " + literacyPercent;
    }

    @Override
    public int compareTo(Person o) {
        if (literacyPercent > o.getLiteracyPercent()){
            return 1;
        } else if (literacyPercent < o.literacyPercent) {
            return -1;
        }
        return 0;
    }
}
