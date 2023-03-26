set.seed(123456)
nn=200
arl_sim = ts(arima.sim(list(order = c(1,0,0),ar = 0.6),n = nn))
plot(arl_sim,main = "AR(1)",xlab='',ylab = 'AR(1)=0.6',col = 'steelblue')
acf(arl_sim,main = 'AR(1)',col = 'steelblue')
acf(arl_sim,main = '')
