FROM  ubuntu:18.04
# 将jdk拷贝到容器中的opt目录下并解压
ADD  ./jdk-8u221-linux-x64.tar.gz  /opt/
# 配置jdk环境变量
ENV JAVA_HOME /opt/jdk1.8.0_221/
ENV  CLASSPATH ${JAVA_HOME}/lib;${JAVA_HOME}/jre/lib;
ENV PATH $JAVA_HOME/bin:$PATH
COPY ./smart.jar  /
CMD ["java", "-jar" ,"smart.jar"]