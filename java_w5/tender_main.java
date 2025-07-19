package week5_oop;

// Question 9: Define a class Tender containing data members cost and company name.
// Accept data for five objects and display the company name for which cost is minimum.

import java.util.Scanner;

class Tender {
    private String companyName;
    private double cost;

    Tender(String companyName, double cost) {
        this.companyName = companyName;
        this.cost = cost;
    }

    double getCost() {
        return cost;
    }

    String getCompanyName() {
        return companyName;
    }
}

// Main class to test Tender class
public class tender_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tender[] tenders = new Tender[5];

        for (int i = 0; i < tenders.length; i++) {
            System.out.print("Enter company name for tender " + (i + 1) + ": ");
            String companyName = scanner.nextLine();
            System.out.print("Enter cost for tender " + (i + 1) + ": ");
            double cost = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            tenders[i] = new Tender(companyName, cost);
        }

        Tender minCostTender = tenders[0];
        for (Tender tender : tenders) {
            if (tender.getCost() < minCostTender.getCost()) {
                minCostTender = tender;
            }
        }

        System.out.println("The company with the minimum cost is: " + minCostTender.getCompanyName());
    }
}

/*
Sample Output:
Enter company name for tender 1: Alpha Inc.
Enter cost for tender 1: 10000
Enter company name for tender 2: Beta Corp.
Enter cost for tender 2: 9500
Enter company name for tender 3: Gamma Ltd.
Enter cost for tender 3: 11000
Enter company name for tender 4: Delta Co.
Enter cost for tender 4: 9800
Enter company name for tender 5: Epsilon LLC
Enter cost for tender 5: 9700

The company with the minimum cost is: Beta Corp.
*/
