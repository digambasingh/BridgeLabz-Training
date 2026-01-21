package com.bridgelabz.generics.dynamiconlinemarketplace;

class DiscountUtil {

    // Generic method with bounded type
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discount);
    }
}

