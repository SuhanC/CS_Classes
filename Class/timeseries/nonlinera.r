library(forecast)
library(ggplot2)
library(fGarch)
install.packages(('fGarch'))
set.seed(123456)
nn=200
arimal_sim = ts(arima.sim(list(order = c(1,1,1),ar = 0.6,ma = 0.6),
n = nn))
plot(arimal_sim,main=',xlab=',ylab='ARIMA(1,1,1)',col = 'steelblue')
acf(arimal_sim,main='',col='steelblue')
pacf(arimal_sim,main='',col='steelblue')
spectrum(arimal_sim,spans=c(3,3),main='')


set.seed(5)
spec = garchSpec(model = list(aplha = c(0.5,0.4),beta = 0))
garchsim = garchSim(spec,n = 200)
garchsim%>%ggtsdisplay(main='',theme=theme_bw())
garchsim^2%>%ggtsdisplay(main='',theme=theme_bw())
