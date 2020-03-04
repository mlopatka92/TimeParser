package pl.mlopatka.timeparser;

import pl.mlopatka.timeparser.config.AllowedUnits;
import pl.mlopatka.timeparser.units.TimeUnit;

public class TimeParserServiceImpl implements TimeParserService {

    @Override
    public String toPrettyString(long secs) {
        StringBuilder sb = new StringBuilder();
        for(TimeUnit timeUnit : AllowedUnits.timeUnitsDsc) {
            long unitVal = secs / timeUnit.getValue();
            if(unitVal > 0) {
                sb.append(unitVal + " " + timeUnit.getName() + " ");
            }

            secs -= (unitVal * timeUnit.getValue());
        }
        
        return sb.toString();
    }
}
