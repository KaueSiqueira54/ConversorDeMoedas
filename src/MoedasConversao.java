public class MoedasConversao {
    private ConversionRates conversion_rates;

    public ConversionRates getConversion_rates() {
        return conversion_rates;
    }

    public void setConversion_rates(ConversionRates conversion_rates) {
        this.conversion_rates = conversion_rates;
    }

    public static class ConversionRates {
        private double USD;
        private double ARS;
        private double COP;
        private double BRL;

        public double getARS() {
            return ARS;
        }

        public double getUSD() {
            return USD;
        }

        public double getCOP() {
            return COP;
        }

        public double getBRL() {
            return BRL;
        }
    }

    @Override
    public String toString() {
        if(conversion_rates == null) {
            return "Erro";
        }
        return "USD: " + conversion_rates.getUSD() +
                ", ARS: " + conversion_rates.getARS() +
                ", COP: " + conversion_rates.getCOP() +
                ", BRL: " + conversion_rates.getBRL();
    }
}
