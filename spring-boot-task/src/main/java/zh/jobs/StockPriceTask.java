package zh.jobs;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import zh.entity.StockPrice;
import zh.mapper.StockPriceMapper;

@Component
@AllArgsConstructor
public class StockPriceTask {
    private final StockPriceMapper stockPriceMapper;
    private final StockPrice stockPrice;
}
