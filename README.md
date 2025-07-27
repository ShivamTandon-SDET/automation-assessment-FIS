# Automation Assessment

## Structure
- `ui-automation`: Selenium  to automate eBay
- `api-automation`: REST Assured to test CoinGecko API

## How to Run
- run 'AddToCartTest.java' , run as testNg Test
- run 'CoinGeckoAPITest.java' , run as TestNg Test


## Assumptions
- No login required for cart verification

##Note
-eBay detected script as automation and is either blocking the redirection or sending to a dummy/broken page
-Due to eBay's bot protection and expired dynamic product URLs,this test navigates directly to a stable book product to demonstrate cart functionality.
    	
