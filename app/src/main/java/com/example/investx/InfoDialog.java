package com.example.investx;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatDialogFragment;

import com.example.investx.R;


public class InfoDialog extends AppCompatDialogFragment {

    private int pos;
    private String[] infoText;

    public InfoDialog(int pos) {
        this.pos = pos;
        String infoStocks = "<h1>Value Investing</h1>\n" +
                "<p>Value investing is a long-term approach to investing, focusing on companies that are undervalued by the market. It involves looking at the big picture and long-term trends and performance, rather than short-term gains. Warren Buffett is often cited as an example of a value investor. Over the long-run, value investing has produced superior returns, however, it has also seen prolonged periods of underperformance compared to growth investing. A study found that value strategies lagged behind growth strategies during three periods over the last 90 years. It remains to be seen if value stocks will regain their popularity in the near future.</p>\n" +
                "<h2>Pros</h2>\n" +
                "<ul>\n" +
                "<li>There's long-term opportunity for large gains as the market fully realizes a value company's true intrinsic value.</li>\n" +
                "<li>Value companies often have stronger risk/reward relationships.</li>\n" +
                "<li>Value investing is rooted in fundamental analysis and often supported by financial metrics.</li>\n" +
                "<li>Value companies are more likely to issue dividends as they aren't as reliant on cash for growth.</li>\n" +
                "</ul>\n" +
                "<h2>Cons</h2>\n" +
                "<ul>\n" +
                "<li>Value companies are often hard to find especially considering how earnings can be inflated due to accounting practices.</li>\n" +
                "<li>Successful value investments take time, and investors must be more patient.</li>\n" +
                "<li>Even after holding long-term, there's no guarantee of success - the company may even be in worse shape than before.</li>\n" +
                "<li>Investing only in sectors that are underperforming decreases your portfolio's diversification.</li>\n" +
                "</ul>\n" +
                "<h1>Growth Investing</h1>\n" +
                "<p>Growth investing is a strategy that focuses on companies with high growth potential. It is generally considered riskier and suitable for investors with shorter investment horizons and greater potential returns. It is also ideal for investors that are not concerned with investment cashflow or dividends. A study from New York University's Stern School of Business found that while growth investing underperforms value investing over long time periods, it also has sub-periods where it dominates. However, determining when these sub-periods will occur is challenging. Growth companies are generally smaller and younger with less market presence, making them more likely to go bankrupt than value companies. Therefore, it is better for investors with greater disposable income as there is greater downside for the loss of capital compared to other investing strategies.</p>\n" +
                "<h2>Pros</h2>\n" +
                "<ul>\n" +
                "<li>Growth stocks and funds aim for shorter-term capital appreciation. If you make profits, it'll usually be quicker than compared to value stocks.</li>\n" +
                "<li>Once growth companies begin to grow, they often experience the sharpest and greatest stock price increases.</li>\n" +
                "<li>Growth investing doesn't rely as heavily on technical analysis and can be easier to begin investing in.</li>\n" +
                "<li>Growth companies can often be boosted by momentum; once growth begins, future periods of continued growth (and stock appreciation) are more likely.</li>\n" +
                "</ul>\n" +
                "<h2>Cons</h2>\n" +
                "<ul>\n" +
                "<li>Growth stocks are often more volatile. Good times are good, but if a company isn't growing, its stock price will suffer.</li>\n" +
                "<li>Depending on macroeconomic conditions, growth stocks may be long-term holds. For example, increasing interest rates works against growth companies.</li>\n" +
                "<li>Growth companies rely on capital for expansion, so don't expect dividends.</li>\n" +
                "<li>Growth companies often trade at high multiple of earnings; entry into growth stocks may be higher than entry into other types of stocks.</li>\n" +
                "</ul>\n" +
                "<h1>Momentum Investing</h1>\n" +
                "<p>In summary, momentum investing is a highly active and speculative strategy that involves buying and selling stocks that have recently performed well with the expectation of them continuing to do so. It requires constant monitoring and technical analysis, and it's different from buy-and-hold strategies which are more passive. Investors need to be at the switch and ready to buy and sell at all times. Profits are expected to be built over months, not years. ETFs are available for those who don't want to watch the market daily. However, due to its speculative nature, momentum investing is considered one of the riskiest strategies and is most suitable for investors who have capital they are comfortable losing.</p>" +
                "<h1>Value Investing</h1>\n" +
                "<p>Value investing is a long-term approach to investing, focusing on companies that are undervalued by the market. It involves looking at the big picture and long-term trends and performance, rather than short-term gains. Warren Buffett is often cited as an example of a value investor. Over the long-run, value investing has produced superior returns, however, it has also seen prolonged periods of underperformance compared to growth investing. A study found that value strategies lagged behind growth strategies during three periods over the last 90 years. It remains to be seen if value stocks will regain their popularity in the near future.</p>\n" +
                "<h2>Pros</h2>\n" +
                "<ul>\n" +
                "<li>There's long-term opportunity for large gains as the market fully realizes a value company's true intrinsic value.</li>\n" +
                "<li>Value companies often have stronger risk/reward relationships.</li>\n" +
                "<li>Value investing is rooted in fundamental analysis and often supported by financial metrics.</li>\n" +
                "<li>Value companies are more likely to issue dividends as they aren't as reliant on cash for growth.</li>\n" +
                "</ul>\n" +
                "<h2>Cons</h2>\n" +
                "<ul>\n" +
                "<li>Value companies are often hard to find especially considering how earnings can be inflated due to accounting practices.</li>\n" +
                "<li>Successful value investments take time, and investors must be more patient.</li>\n" +
                "<li>Even after holding long-term, there's no guarantee of success - the company may even be in worse shape than before.</li>\n" +
                "<li>Investing only in sectors that are underperforming decreases your portfolio's diversification.</li>\n" +
                "</ul>\n" +
                "<h1>Growth Investing</h1>\n" +
                "<p>Growth investing is a strategy that focuses on companies with high growth potential. It is generally considered riskier and suitable for investors with shorter investment horizons and greater potential returns. It is also ideal for investors that are not concerned with investment cashflow or dividends. A study from New York University's Stern School of Business found that while growth investing underperforms value investing over long time periods, it also has sub-periods where it dominates. However, determining when these sub-periods will occur is challenging. Growth companies are generally smaller and younger with less market presence, making them more likely to go bankrupt than value companies. Therefore, it is better for investors with greater disposable income as there is greater downside for the loss of capital compared to other investing strategies.</p>\n" +
                "<h2>Pros</h2>\n" +
                "<ul>\n" +
                "<li>Growth stocks and funds aim for shorter-term capital appreciation. If you make profits, it'll usually be quicker than compared to value stocks.</li>\n" +
                "<li>Once growth companies begin to grow, they often experience the sharpest and greatest stock price increases.</li>\n" +
                "<li>Growth investing doesn't rely as heavily on technical analysis and can be easier to begin investing in.</li>\n" +
                "<li>Growth companies can often be boosted by momentum; once growth begins, future periods of continued growth (and stock appreciation) are more likely.</li>\n" +
                "</ul>\n" +
                "<h2>Cons</h2>\n" +
                "<ul>\n" +
                "<li>Growth stocks are often more volatile. Good times are good, but if a company isn't growing, its stock price will suffer.</li>\n" +
                "<li>Depending on macroeconomic conditions, growth stocks may be long-term holds. For example, increasing interest rates works against growth companies.</li>" +
                "<h2>Cons</h2>\n" +
                "<ul>\n" +
                "<li>Growth companies rely on capital for expansion, so don't expect dividends.</li>\n" +
                "<li>Growth companies often trade at high multiple of earnings; entry into growth stocks may be higher than entry into other types of stocks.</li>\n" +
                "</ul>\n" +
                "<h1>Momentum Investing</h1>\n" +
                "<p>In summary, momentum investing is a highly active and speculative strategy that involves buying and selling stocks that have recently performed well with the expectation of them continuing to do so. It requires constant monitoring and technical analysis, and it's different from buy-and-hold strategies which are more passive. Investors need to be at the switch and ready to buy and sell at all times. Profits are expected to be built over months, not years. ETFs are available for those who don't want to watch the market daily. However, due to its speculative nature, momentum investing is considered one of the riskiest strategies and is most suitable for investors who have capital they are comfortable losing.</p>" +
                "<h2>Pros</h2>\n" +
                "<ul>\n" +
                "<li>Provides regular income and properties can appreciate</li>\n" +
                "<li>Maximizes capital through leverage</li>\n" +
                "<li>Many tax-deductible associated expenses</li>\n" +
                "</ul>\n" +
                "<h2>Cons</h2>\n" +
                "<ul>\n" +
                "<li>Managing tenants can be tedious</li>\n" +
                "<li>Potentially damage property from tenants</li>\n" +
                "<li>Reduced income from potential vacancies</li>\n" +
                "</ul>\n" +
                "<h1>Real Estate Investment Groups (REIGs)</h1>\n" +
                "<p>Real estate investment groups (REIGs) are a way for individuals to invest in rental properties without the responsibilities of managing them. They work like small mutual funds where a company buys or builds properties, and investors can purchase units through the company. The company handles maintenance, advertising, and tenant management in exchange for a percentage of the monthly rent. The lease is in the investor's name and a portion of rent from all units is pooled to cover costs in case of vacancies.</p>\n" +
                "<h2>Pros</h2>\n" +
                "<ul>\n" +
                "<li>More hands-off than owning rentals</li>\n" +
                "<li>Provides income and appreciation</li>\n" +
                "</ul>\n" +
                "<h2>Cons</h2>\n" +
                "<ul>\n" +
                "<li>Vacancy risks</li>\n" +
                "<li>Fees similar to those associated with mutual funds</li>\n" +
                "<li>Susceptible to unscrupulous managers</li>\n" +
                "</ul>\n" +
                "<h1>House Flipping</h1>\n" +
                "<p>House flipping is a form of real estate investing that requires significant experience and capital. It involves buying undervalued properties with the intention of quickly reselling them for a profit. Pure property flippers usually don't invest in improving the properties, so the investment must already have the intrinsic value to turn a profit without any alterations. However, some flippers buy reasonably priced properties and add value by renovating them which can be a longer-term investment. It's important to note that due to the short-term nature of the investment, flippers need to have enough cash on hand to pay the mortgage and avoid snowballing losses.</p>\n" +
                "<h2>Pros</h2>\n" +
                "<ul>\n" +
                "<li>Ties up capital for a shorter time period</li>\n" +
                "</ul>";

        String realEstate = "<h1>Rental Properties</h1>\n" +
                "<p>Owning rental properties can be a great opportunity for individuals who have do-it-yourself (DIY) renovation skills and the patience to manage tenants. However, this strategy does require substantial capital to finance upfront maintenance costs and to cover vacant months.</p>\n" +
                "<h2>Pros:</h2>\n" +
                "<ul>\n" +
                "<li>Provides regular income and properties can appreciate</li>\n" +
                "<li>Maximizes capital through leverage</li>\n" +
                "<li>Many tax-deductible associated expenses</li>\n" +
                "</ul>\n" +
                "<h2>Cons:</h2>\n" +
                "<ul>\n" +
                "<li>Managing tenants can be tedious</li>\n" +
                "<li>Potentially damage property from tenants</li>\n" +
                "<li>Reduced income from potential vacancies</li>\n" +
                "</ul>\n" +
                "<h1>Real Estate Investment Groups (REIGs)</h1>\n" +
                "<p>Real estate investment groups (REIGs) are a way for individuals to invest in rental properties without the responsibilities of managing them. They work like small mutual funds where a company buys or builds properties, and investors can purchase units through the company. The company handles maintenance, advertising, and tenant management in exchange for a percentage of the monthly rent. The lease is in the investor's name and a portion of rent from all units is pooled to cover costs in case of vacancies.</p>\n" +
                "<h2>Pros</h2>\n" +
                "<ul>\n" +
                "<li>More hands-off than owning rentals</li>\n" +
                "<li>Provides income and appreciation</li>\n" +
                "</ul>\n" +
                "<h2>Cons</h2>\n" +
                "<ul>\n" +
                "<li>Vacancy risks</li>\n" +
                "<li>Fees similar to those associated with mutual funds</li>\n" +
                "<li>Susceptible to unscrupulous managers</li>\n" +
                "</ul>\n" +
                "<h1>House Flipping</h1>\n" +
                "<p>House flipping is a form of real estate investing that requires significant experience and capital. It involves buying undervalued properties with the intention of quickly reselling them for a profit. Pure property flippers usually don't invest in improving the properties, so the investment must already have the intrinsic value to turn a profit without any alterations. However, some flippers buy reasonably priced properties and add value by renovating them which can be a longer-term investment. It's important to note that due to the short-term nature of the investment, flippers need to have enough cash on hand to pay the mortgage and avoid snowballing losses.</p>\n" +
                "<h2>Pros</h2>\n" +
                "<ul>\n" +
                "<li>Ties up capital for a shorter time period</li>\n" +
                "<li>Can offer quick returns</li>\n" +
                "</ul>\n" +
                "<h2>Cons</h2>\n" +
                "<ul>\n" +
                "<li>Requires a deeper market knowledge</li>\n" +
                "<li>Hot markets cooling unexpectedly</li>\n" +
                "</ul>\n" +
                "<h1>Online Real Estate Platforms</h1>\n" +
                "<p>Real estate investing platforms are for those who want to join others in investing in a bigger commercial or residential deal. The investment is made via online real estate platforms, which are also known as real estate crowdfunding. This still requires investing capital, although less than what's required to purchase properties outright.</p>\n" +
                "<p>Online platforms connect investors who are looking to finance projects with real estate developers. In some cases, you can diversify your investments with not much money.</p>\n" +
                "<h2>Pros</h2>\n" +
                "<ul>\n" +
                "<li>Can invest in single projects or portfolio of projects</li>\n" +
                "<li>Geographic diversification</li>\n" +
                "</ul>\n" +
                "<h2>Cons</h2>\n" +
                "<ul>\n" +
                "<li>Tend to be illiquid with lockup periods</li>\n" +
                "<li>Management fees</li>\n" +
                "</ul>";
        String bond = "<h1>Bond Investing</h1>\n" +
                "<p>Bonds can play a vital role in any investment portfolio. Bonds yield income, are often considered less risky than stocks and can help diversify your portfolio. Also known as fixed income instruments, bonds are used by governments or companies to raise money by borrowing from investors. In return, the bond issuer promises to pay back the investment, with interest, over a certain period of time. Certain types of bonds – corporate and government bonds – are rated by credit agencies to help determine the quality of those bonds. These ratings are used to help assess the likelihood that investors will be repaid. Typically, bond ratings are grouped into two major categories: investment grade (higher rated) and high yield (lower rated).</p>\n" +
                "<h2>Pros</h2>\n" +
                "<ul>\n" +
                "  <li>Income generation: Bonds provide a fixed amount of income at regular intervals in the form of coupon payments.</li>\n" +
                "  <li>Diversification: Investing in a balance of stocks, bonds and other asset classes can help you build a portfolio that seeks returns but is resilient through all market environments. Stocks and bonds typically have an inverse relationship, meaning that when the stock market is down, bonds become more appealing.</li>\n" +
                "  <li>Risk management: Fixed income is broadly understood to carry lower risk than stocks. This is because fixed income assets are generally less sensitive to macroeconomic risks, such as economic downturns and geopolitical events.</li>\n" +
                "</ul>\n" +
                "<h2>Cons</h2>\n" +
                "<ul>\n" +
                "  <li>Interest rate risk: When interest rates rise, bond prices fall, and the bonds that you currently hold can lose value. Interest rate movements are the major cause of price volatility in bond markets.</li>\n" +
                "  <li>Inflation risk: Inflation is the rate at which the price of goods and services rises over time. If the rate of inflation outpaces the fixed amount of income a bond provides, the investor loses purchasing power.</li>\n" +
                "  <li>Credit risk: Credit risk (also known as business risk or financial risk) is the possibility that an issuer could default on its debt obligation.</li>\n" +
                "  <li>Liquidity risk: Liquidity risk is the possibility that an investor might wish to sell a bond but is unable to find a buyer.</li>\n" +
                "</ul>";
        this.infoText = new String[]{infoStocks, realEstate, bond};
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.info_popup_layout, null);

        TextView text = view.findViewById(R.id.id_popuptext);

        text.setText(Html.fromHtml(infoText[pos % 3]));
        String label = "";
        if (pos == 0)
            label = "Tips on Stock Investments";
        else if (pos == 1)
            label = "Tips on Real Estate Investments";
        else
            label = "Tips on Bond Investments";

        builder.setView(view).setTitle(label).setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        return builder.create();
    }
}
