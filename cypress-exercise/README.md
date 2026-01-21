# Cypress E2E Testing Exercise

## Introduction
This repository contains End-to-End (E2E) automated tests for the [SauceDemo](https://www.saucedemo.com) website using Cypress. The tests cover login functionality, cart management, and the checkout process.

## Prerequisites
- Node.js (version 14 or higher)
- npm (Node Package Manager)

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/mizi472004-sys/KTPM.git
   cd KTPM/cypress-exercise
   ```
2. Install dependencies:
   ```bash
   npm install
   ```

## Running Tests
To open the Cypress Test Runner:
```bash
npx cypress open
```
Or to run tests in headless mode:
```bash
npx cypress run
```

## Test Scenarios
1. **Login Test** (`cypress/e2e/login_spec.cy.js`):
   - Verify successful login with valid credentials.
   - Verify error message with invalid credentials.
2. **Cart Test** (`cypress/e2e/cart_spec.cy.js`):
   - Verify adding a product to the cart.
   - Verify sorting products by price (low to high).
   - Verify removing a product from the cart.
   - Verify the checkout process (up to overview page).

## Submission
This project is part of the automated testing practice.

---
*Note: Screenshots and videos of test execution are stored in `cypress/screenshots` and `cypress/videos` respectively (locally).*
