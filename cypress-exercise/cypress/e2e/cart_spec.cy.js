describe('Cart Test', () => {
    beforeEach(() => {
        cy.visit('https://www.saucedemo.com');
        cy.get('#user-name').type('standard_user');
        cy.get('#password').type('secret_sauce');
        cy.get('#login-button').click();
    });

    it('Should add a product to the cart', () => {
        cy.get('.inventory_item').first().find('.btn_inventory').click();
        cy.get('.shopping_cart_badge').should('have.text', '1');
    });

    it('Should sort products by price low to high', () => {
        cy.get('.product_sort_container').select('lohi');
        cy.get('.inventory_item_price').first().should('have.text', '$7.99');
    });

    it('Should remove a product from the cart', () => {
        // Add a product to the cart
        cy.get('.inventory_item').first().find('.btn_inventory').click();
        cy.get('.shopping_cart_badge').should('have.text', '1');

        // Remove the product
        cy.contains('button', 'Remove').click();

        // Verify the cart badge is gone (quantity 0)
        cy.get('.shopping_cart_badge').should('not.exist');
    });

    it('Should complete the checkout process', () => {
        // Add a product to the cart
        cy.get('.inventory_item').first().find('.btn_inventory').click();

        // Go to cart
        cy.get('.shopping_cart_link').click();
        cy.url().should('include', '/cart.html');

        // Click checkout
        cy.get('#checkout').click();
        cy.url().should('include', '/checkout-step-one.html');

        // Fill in checkout information
        cy.get('#first-name').type('John');
        cy.get('#last-name').type('Doe');
        cy.get('#postal-code').type('12345');

        // Click continue
        cy.get('#continue').click();

        // Verify we are on the next step
        cy.url().should('include', '/checkout-step-two.html');
    });
});
