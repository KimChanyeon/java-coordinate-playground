package car;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class RentCompanyTest {

    @Test
    public void report() throws Exception {
        RentCompany company = RentCompany.create(); // factory method를 사용해 생성
        company.addCar(new Sonata(150));
        company.addCar(new K5(260));
        company.addCar(new Sonata(120));
        company.addCar(new Avante(300));
        company.addCar(new K5(390));

        String report = company.generateReport();
        assertThat(report).isEqualTo(
                "Sonata : 15리터" + System.lineSeparator() +
                        "K5 : 20리터" + System.lineSeparator() +
                        "Sonata : 12리터" + System.lineSeparator() +
                        "Avante : 20리터" + System.lineSeparator() +
                        "K5 : 30리터" + System.lineSeparator()
        );
    }

}