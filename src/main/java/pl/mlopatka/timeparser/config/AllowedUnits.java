package pl.mlopatka.timeparser.config;

import pl.mlopatka.timeparser.units.TimeUnit;

import java.util.List;

public class AllowedUnits {

    public static final List<TimeUnit> timeUnitsDsc = List.of(
            new TimeUnit("min", 60),
            new TimeUnit("sec", 1)
    );
}
