rem @echo off
md \dev\jni4net\lib\
md \dev\jni4net\bin\
copy jni4net.proxygen\target\proxygen.exe \dev\jni4net\bin\
copy jni4net.j\target\*.jar \dev\jni4net\lib\
copy jni4net.n\target\jni4net.n-*.dll \dev\jni4net\lib\
copy jni4net.n.w64.v40\target\jni4net.n.w64.v40-*.0.dll \dev\jni4net\lib\
copy jni4net.n.w32.v40\target\jni4net.n.w32.v40-*.0.dll \dev\jni4net\lib\
