filename = ENV['OUTFILE'] || 'the_road_from_java8_to_java11'
version = `git describe`
date = Time.now.strftime("%Y-%m-%d")
params = "-a toc --attribute revnumber='#{version}' --attribute revdate='#{date}' --failure-level WARN"

task :html do
  begin
    puts "Converting to HTML..."
    system "bundle exec asciidoctor #{params} --out-file #{filename}.html main.adoc" or raise
    puts " -- HTML output at #{filename}.html"
  end
end

task :pdf do
  begin
    puts "Converting to PDF... "
    system "bundle exec asciidoctor-pdf #{params} --out-file #{filename}.pdf main.adoc" or raise
    puts " -- PDF output at #{filename}.pdf"
  end
end

task all: [:pdf, :html]

task :default => :all
