public class BonusService {
    public long calculate(long amount, boolean registered) {
        int Percent = registered ? 3 : 1;
        long bonus = amount * Percent / 100;
        long limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}

// 1.Проверка-расчет бонуса зарегестрированного бонуса(3проц),если менше бонуса
// 2.Проверка-расчет бонуса не зарегесттрированноо бонуса(1проц), если меньше бонуса
// 3.Проверка-расчет бонуса зарегестрированного бонуса(3проц),если больше бонуса
// 4.Проверка-расчет бонуса не зарегесттрированноо бонуса(1проц), если больше бонуса