import org.javers.core.Javers;
import org.javers.core.JaversBuilder;
import org.javers.core.diff.Diff;

/**
 * Created by rmaia on 2/11/15.
 */
public class Matcher {

    public static boolean Match(Object base, Object working){

        Javers javers = JaversBuilder.javers().build();

        Diff compare = javers.compare(base, working);
        System.out.println(compare.changesSummary());
        return !compare.hasChanges();

    }
}
