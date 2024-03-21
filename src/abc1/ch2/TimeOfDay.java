package abc1.ch2;

public record TimeOfDay(int hour, int minute) {
    public TimeOfDay plusMinutes(int add) {
        var mSum = minute + add % 60;
        var hrSum = hour + add / 60;

        if (mSum > 60) {
            hrSum++;
            mSum -= 60;
        }

        return new TimeOfDay(hrSum, mSum);
    }

    public int minutesFrom(TimeOfDay next) {
        int hrDiff = next.hour - hour;
        int mDiff = next.minute - minute;

        if (mDiff < 0) {
            hrDiff--;
            mDiff += 60;
        }

        if (hrDiff < 0) {
            hrDiff += 24;
        }

        return hrDiff * 60 + mDiff;
    }
}
