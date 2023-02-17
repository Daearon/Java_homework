package homework2;

public class task1 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("select * from students where ");
        String filter_first = "{\"name\":\"Ivanov\",\"country\":\"Russia\",\"city\":\"Moscow\",\"age\":\"null\"}";

        String filer_second = filter_first.replace("\"", "")
                .replace("{", "")
                .replace("}", "")
                .replace(" ", "");

        String[] stringArray = filer_second.split(",");

        for (String s : stringArray) {
            if (!s.contains("null")) {
                sb.append(s.split(":")[0])
                        .append(" = ").append('\'')
                        .append(s.split(":")[1])
                        .append('\'').append(" and ");
            }
        }
        sb.replace(sb.length() - 5, sb.length(), "");
        System.out.println(sb);
    }
}
