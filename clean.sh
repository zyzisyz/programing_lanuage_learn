for file in `find -name "*.class"`
do
	echo delete $file
	rm -rf $file
done

for file in `find -name "*a.out"`
do
	echo delete $file
	rm -rf $file
done
