from selenium import webdriver
import unittest

class TestChrome(unittest.TestCase):
    def setUp(self):
        self.browser = webdriver.Chrome()
        self.browser.get("http://localhost:8000")
        assert "Congratulations!" in self.browser.title

    def test_page_title(self):
        self.browser.get("http://localhost:8000/index.html")
        expected_title = "GitHub: Let’s build from here · GitHub"
        actual_title = self.browser.title
        self.assertEqual(expected_title, actual_title)
        print(actual_title)

    def tearDown(self):
        self.browser.quit()

if __name__ == "__main__":
    unittest.main()