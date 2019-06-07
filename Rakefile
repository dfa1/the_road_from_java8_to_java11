filename = 'the_road_from_java8_to_java11'
version = `git describe`
date = Time.now.strftime("%Y-%m-%d")
params = "--attribute revnumber='#{version}' --attribute revdate='#{date}' --failure-level WARN"

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

task :check do
  begin
    system "bundle exec awesome_bot --white-list 'http://0.0.0.0:80,http://localhost' --allow-redirect --skip-save-results main.adoc" or raise
  end
end

task build: [:pdf, :html]

task all: [:check, :build]

task :default => :all
