import org.apache.commons.lang3.StringUtils;

public class TestFirst {
    public void testHello() {
        System.out.println(StringUtils.center(
                " TestFirst class - testHello ",
                60,
                '#'
        ));
    }

    public void testWorld() {
        System.out.println(StringUtils.center(
                " TestFirst class - testWorld ",
                60,
                '#'
        ));
    }
}
